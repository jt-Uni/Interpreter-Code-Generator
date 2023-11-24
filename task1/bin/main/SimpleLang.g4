grammar SimpleLang;

prog : dec+ EOF;

dec
    : typed_idfr LParen vardec RParen body
;

vardec
    : (typed_idfr ( Comma typed_idfr ) * )?
;

typed_idfr
    : type Idfr
;

type
    : 'int' | 'bool' | 'unit'
;

body
    : LBrace (typed_idfr ':=' exp ';')* ene+=exp (Semicolon ene+=exp)* RBrace
;

block
    : LBrace ene+=exp ( Semicolon ene+=exp )* RBrace
;

exp
    : Idfr                                                  #IdExpr
    | IntLit                                                #IntExpr
    | BoolLit                                               #BoolLitExpr
    | Idfr Assign exp                                       #AssignExpr
    | LParen exp binop exp RParen                           #BinOpExpr
    | exp binop exp                                         #ExprBinOpExpr
    | Idfr LParen (args+=exp (Comma args+=exp)*)? RParen                               #InvokeExpr
    | block                                                 #BlockExpr
    | If exp Then block Else block                          #IfExpr
    | Print exp                                             #PrintExpr
    | While exp Do block                                    #WhileExpr
    | Repeat block 'until' exp                              #ForExpr
    | Space                                                 #SpaceExpr
    | NewLine                                               #NewlineExpr
    | Skip                                                  #SkipExpr
;



binop
    : Eq            #EqBinop
    | Less          #LessBinop
    | LessEq        #LessEqBinop
    | Greater       #Greater
    | GreaterEq     #GreaterEq
    | Divide        #DivideBinop
    | Plus          #PlusBinop
    | Minus         #MinusBinop
    | Times         #TimesBinop
    | And           #AndBinop
    | Or            #AndBinop
    | Xor           #AndBinop
;

LParen : '(' ;
Comma : ',' ;
RParen : ')' ;
LBrace : '{' ;
Semicolon : ';' ;
RBrace : '}' ;

Eq : '==' ;
Less : '<' ;
LessEq : '<=' ;
Greater : '>' ;
GreaterEq : '>=';

Plus : '+' ;
Times : '*' ;
Minus : '-' ;
Divide : '/';

And : '&';
Or : '|';
Xor : '^';

Assign : ':=' ;

Print : 'print' ;
Space : 'space' ;
NewLine : 'newline' ;
If : 'if' ;
Then : 'then' ;
Else : 'else' ;

While: 'while';
Do: 'do';
Repeat: 'repeat';
Skip: 'skip';

BoolLit : 'true' | 'false' ;
IntLit : '0' | ('-'? [1-9][0-9]*) ;
Idfr : [a-z][A-Za-z0-9_]* ;
WS : [ \n\r\t]+ -> skip ;
