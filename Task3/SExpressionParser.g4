parser grammar SExpressionParser;
@header {
    package Task3;
}

options { tokenVocab=SExpressionLexer; }

sexpression: LEFT_PAREN head arg arg+ RIGHT_PAREN
           | LEFT_BRACKET head arg arg+ RIGHT_BRACKET
           | LEFT_CURLY head arg arg+ RIGHT_CURLY
           ;

head: PLUS | MINUS | DIVIDE | TIMES;

arg: Float | Integer | Long | Double
   | sexpression
   ;