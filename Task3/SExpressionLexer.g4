lexer grammar SExpressionLexer;
@lexer::header {package Task3;}

fragment Digits: ([0-9])+ ;

Float: Digits '.' Digits FloatSuffix?;

Double: Digits '.' Digits DoubleSuffix;

Integer: Digits;

Long: Digits LongSuffix;

fragment LongSuffix: [lL];
fragment DoubleSuffix: [Dd];
fragment FloatSuffix: [fF];

LEFT_PAREN: '(';
RIGHT_PAREN: ')';

LEFT_CURLY: '{';
RIGHT_CURLY: '}';

LEFT_BRACKET: '[';
RIGHT_BRACKET: ']';

PLUS: '+';
MINUS: '-';
DIVIDE: '/';
TIMES: '*';


WS: [ \t\r\n]+ -> channel(HIDDEN);