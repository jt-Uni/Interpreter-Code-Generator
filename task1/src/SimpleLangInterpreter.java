import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class SimpleLangInterpreter extends AbstractParseTreeVisitor<Integer> implements SimpleLangVisitor<Integer> {

    private final Map<String, SimpleLangParser.DecContext> global_funcs = new HashMap<>();
    private final Stack<Map<String, Integer>> frames = new Stack<>();
    private final Map<String, Integer> localVars = new HashMap<>();

    public Integer visitProgram(SimpleLangParser.ProgContext ctx, String[] args) {
        for (int i = 0; i < ctx.dec().size(); ++i) {
            SimpleLangParser.DecContext dec = ctx.dec(i);
            SimpleLangParser.Typed_idfrContext typedIdfr = dec.typed_idfr();
            global_funcs.put(typedIdfr.Idfr().getText(), dec);
        }

        SimpleLangParser.DecContext main = global_funcs.get("main");

        Map<String, Integer> newFrame = new HashMap<>();
        for (int i = 0; i < args.length; ++i) {
            if (args[i].equals("true")) {
                newFrame.put(main.vardec().typed_idfr().get(i).Idfr().getText(), 1);
            } else if (args[i].equals("false")) {
                newFrame.put(main.vardec().typed_idfr().get(i).Idfr().getText(), 1);
            } else {
                newFrame.put(main.vardec().typed_idfr().get(i).Idfr().getText(), Integer.parseInt(args[i]));
            }
        }

        frames.push(newFrame);
        return visit(main);
    }

    @Override public Integer visitProg(SimpleLangParser.ProgContext ctx)
    {
        throw new RuntimeException("Should not be here!");
    }

    @Override
    public Integer visitDec(SimpleLangParser.DecContext ctx) {
        // Save the current frame

        // Visit the body and get the return value
        Integer returnValue = visit(ctx.body());

        // Restore the frame to its original state
        frames.pop();

        return returnValue;
    }

    @Override
    public Integer visitVardec(SimpleLangParser.VardecContext ctx) {
        return null;
    }

    @Override
    public Integer visitTyped_idfr(SimpleLangParser.Typed_idfrContext ctx) {
        return null;
    }

    @Override
    public Integer visitType(SimpleLangParser.TypeContext ctx) {
        return null;
    }

    @Override
    public Integer visitBody(SimpleLangParser.BodyContext ctx) {
        // Clear the local variable information at the beginning of the body
        localVars.clear();

        // Process each declaration and corresponding expression
        for (int j = 0; j < ctx.typed_idfr().size(); ++j) {

            SimpleLangParser.ExpContext rhs = ctx.exp(j);

            String variableName = ctx.typed_idfr().get(j).Idfr().getText();
            Integer result = visit(rhs);

            localVars.put(variableName, result);
            frames.peek().put(variableName, result);
        }

        // Process each standalone expression in the body
        Integer returnValue = null;
        for (int i = 0; i < ctx.ene.size(); ++i) {
            // Retrieve the expression context at index i from the 'ene' list
            SimpleLangParser.ExpContext exp = ctx.ene.get(i);

            // Visit the expression and update the return value
            returnValue = visit(exp);
        }

        // Return the final result after processing the entire body
        return returnValue;
    }

    @Override public Integer visitBlock(SimpleLangParser.BlockContext ctx)
    {
        Integer returnValue = null;
        for (int i = 0; i < ctx.ene.size(); ++i) {
            SimpleLangParser.ExpContext exp = ctx.ene.get(i);
            returnValue = visit(exp);
        }
        return returnValue;
    }

    @Override
    public Integer visitWhileExpr(SimpleLangParser.WhileExprContext ctx) {
        SimpleLangParser.ExpContext condition = ctx.exp();
        SimpleLangParser.BlockContext block = ctx.block();

        while (visit(condition) > 0) {
            visit(block);
        }

        return null;
    }

    @Override
    public Integer visitSkipExpr(SimpleLangParser.SkipExprContext ctx) {
        return null;
    }

    @Override
    public Integer visitBoolLitExpr(SimpleLangParser.BoolLitExprContext ctx) {
        return null;
    }

    @Override
    public Integer visitAssignExpr(SimpleLangParser.AssignExprContext ctx) {
        SimpleLangParser.ExpContext rhs = ctx.exp();
        String variableName = ctx.Idfr().getText();
        int rhsValue = visit(rhs);

        frames.peek().replace(variableName, rhsValue);
        return null;
    }

    @Override public Integer visitBinOpExpr(SimpleLangParser.BinOpExprContext ctx) {

        SimpleLangParser.ExpContext operand1 = ctx.exp(0);
        Integer oprnd1 = visit(operand1);
        SimpleLangParser.ExpContext operand2 = ctx.exp(1);
        Integer oprnd2 = visit(operand2);

        frames.peek();

        switch (((TerminalNode) (ctx.binop().getChild(0))).getSymbol().getType()) {

            case SimpleLangParser.Eq ->  {

                return ((oprnd1 != null && oprnd1.equals(oprnd2)) ? 1 : 0);

            }
            case SimpleLangParser.Less -> {

                return ((oprnd1 < oprnd2) ? 1 : 0);

            }
            case SimpleLangParser.LessEq -> {

                return ((oprnd1 <= oprnd2) ? 1 : 0);

            }
            case SimpleLangParser.Greater -> {

                return ((oprnd1 > oprnd2) ? 1 : 0);

            }
            case SimpleLangParser.GreaterEq -> {

                return ((oprnd1 >= oprnd2) ? 1 : 0);

            }
            case SimpleLangParser.Plus -> {

                return oprnd1 + oprnd2;

            }
            case SimpleLangParser.Times -> {

                return oprnd1 * oprnd2;

            }
            case SimpleLangParser.Minus -> {

                return oprnd1 - oprnd2;

            }
            case SimpleLangParser.Divide -> {

                return oprnd1 / oprnd2;

            }
            case SimpleLangParser.And -> {

                return (oprnd1 & oprnd2);

            }
            case SimpleLangParser.Or -> {

                return (oprnd1 | oprnd2);

            }
            case SimpleLangParser.Xor -> {

                return ((oprnd1 != 0) ^ (oprnd2 != 0)) ? 1 : 0;

            }
            default -> throw new RuntimeException("Unsupported binary operator: " + ctx.binop().getText());
        }

    }

    @Override
    public Integer visitInvokeExpr(SimpleLangParser.InvokeExprContext ctx) {
        // Get the function name
        String functionName = ctx.Idfr().getText();

        // Get the function declaration from the global_funcs map
        SimpleLangParser.DecContext functionDeclaration = global_funcs.get(functionName);

        //System.out.println("Function Declaration: " + functionDeclaration);
        Map<String, Integer> newFrame = new HashMap<>();

        if (functionDeclaration == null) {
            throw new RuntimeException("Function '" + functionName + "' is not defined.");
        }

        for (int i=0; i < ctx.args.size();i++) {
            SimpleLangParser.Typed_idfrContext name = functionDeclaration.vardec().typed_idfr().get(i);
            SimpleLangParser.ExpContext exp = ctx.args.get(i);
            String par = name.Idfr().getText();
            newFrame.put(par, visit(exp));
        }

        // Push the modified frame onto the stack
        frames.push(newFrame);

        // Return the result of the function call
        return visit(functionDeclaration);
    }


    @Override
    public Integer visitNewlineExpr(SimpleLangParser.NewlineExprContext ctx) {
        System.out.println();
        return null;
    }

    @Override public Integer visitBlockExpr(SimpleLangParser.BlockExprContext ctx) {
        return visit(ctx.block());
    }

    @Override public Integer visitIfExpr(SimpleLangParser.IfExprContext ctx)
    {

        SimpleLangParser.ExpContext cond = ctx.exp();
        Integer condValue = visit(cond);
        if (condValue > 0) {

            SimpleLangParser.BlockContext thenBlock = ctx.block(0);
            return visit(thenBlock);

        } else {

            SimpleLangParser.BlockContext elseBlock = ctx.block(1);
            return visit(elseBlock);

        }

    }

    @Override
    public Integer visitPrintExpr(SimpleLangParser.PrintExprContext ctx) {
        SimpleLangParser.ExpContext exp = ctx.exp();

        if (((TerminalNode) exp.getChild(0)).getSymbol().getType() == SimpleLangParser.Space) {
            System.out.print(" ");
        } else if (((TerminalNode) exp.getChild(0)).getSymbol().getType() == SimpleLangParser.NewLine) {
            System.out.println();
        } else {
            System.out.print(visit(exp));
        }

        return null;
    }

    @Override public Integer visitSpaceExpr(SimpleLangParser.SpaceExprContext ctx) {
        return null;
    }

    @Override
    public Integer visitIdExpr(SimpleLangParser.IdExprContext ctx) {
        return frames.peek().get(ctx.Idfr().getText());
    }


    @Override
    public Integer visitExprBinOpExpr(SimpleLangParser.ExprBinOpExprContext ctx) {

        SimpleLangParser.ExpContext operand1 = ctx.exp(0);
        Integer oprnd1 = visit(operand1);
        SimpleLangParser.ExpContext operand2 = ctx.exp(1);
        Integer oprnd2 = visit(operand2);

        frames.peek();

        switch (((TerminalNode) (ctx.binop().getChild(0))).getSymbol().getType()) {

            case SimpleLangParser.Eq ->  {

                return ((oprnd1 != null && oprnd1.equals(oprnd2)) ? 1 : 0);

            }
            case SimpleLangParser.Less -> {

                return ((oprnd1 < oprnd2) ? 1 : 0);

            }
            case SimpleLangParser.LessEq -> {

                return ((oprnd1 <= oprnd2) ? 1 : 0);

            }
            case SimpleLangParser.Greater -> {

                return ((oprnd1 > oprnd2) ? 1 : 0);

            }
            case SimpleLangParser.GreaterEq -> {

                return ((oprnd1 >= oprnd2) ? 1 : 0);

            }
            case SimpleLangParser.Plus -> {

                return oprnd1 + oprnd2;

            }
            case SimpleLangParser.Times -> {

                return oprnd1 * oprnd2;

            }
            case SimpleLangParser.Minus -> {

                return oprnd1 - oprnd2;

            }
            case SimpleLangParser.Divide -> {

                return oprnd1 / oprnd2;

            }
            case SimpleLangParser.And -> {

                return (oprnd1 & oprnd2);

            }
            case SimpleLangParser.Or -> {

                return (oprnd1 | oprnd2);

            }
            case SimpleLangParser.Xor -> {

                return ((oprnd1 != 0) ^ (oprnd2 != 0)) ? 1 : 0;

            }
            default -> throw new RuntimeException("Unsupported binary operator: " + ctx.binop().getText());
        }

    }

    @Override public Integer visitIntExpr(SimpleLangParser.IntExprContext ctx)
    {
        return Integer.parseInt(ctx.IntLit().getText());
    }

    @Override
    public Integer visitForExpr(SimpleLangParser.ForExprContext ctx) {

        Integer returnValue = null;

        do {
            returnValue = visit(ctx.block());
        } while (visit(ctx.exp()) <= 0);

        return returnValue;

    }

    @Override
    public Integer visitEqBinop(SimpleLangParser.EqBinopContext ctx) {
        return null;
    }

    @Override
    public Integer visitLessBinop(SimpleLangParser.LessBinopContext ctx) {
        return null;
    }

    @Override
    public Integer visitLessEqBinop(SimpleLangParser.LessEqBinopContext ctx) {
        return null;
    }

    @Override
    public Integer visitGreater(SimpleLangParser.GreaterContext ctx) {
        return null;
    }

    @Override
    public Integer visitGreaterEq(SimpleLangParser.GreaterEqContext ctx) {
        return null;
    }

    @Override
    public Integer visitDivideBinop(SimpleLangParser.DivideBinopContext ctx) {
        return null;
    }

    @Override
    public Integer visitPlusBinop(SimpleLangParser.PlusBinopContext ctx) {
        return null;
    }

    @Override
    public Integer visitMinusBinop(SimpleLangParser.MinusBinopContext ctx) {
        return null;
    }

    @Override
    public Integer visitTimesBinop(SimpleLangParser.TimesBinopContext ctx) {
        return null;
    }


    @Override
    public Integer visitAndBinop(SimpleLangParser.AndBinopContext ctx) {
        return null;
    }
}