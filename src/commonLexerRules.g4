lexer grammar commonLexerRules;




ADDADD:  '++';
SUBSUB:  '--';
MUL:    '*' ;
DIV:    '/' ;
ADD:    '+' ;
SUB:    '-' ;
MOULD:  '%' ;

DEF:    'def';

DEFI: '函数';

RETURN:  'return';
IF:     'if';
EQUAL:  '==';
LESS:   '<';
GREATER :'>';
UNEQUAL:  '!=';
GREATER_EQUAL: '>=';
LESS_EQUAL:   '<=';
WHILE:          'while';
FOR:            'for';
BREAK:          'break';
NULL:          'null';
TRUE:           'true';
FALSE:          'false';
//LIST:           'list';

ID:         [a-zA-Z\u4e00-\u9fa5]+[0-9]*;
INT:        ([0-9]+|DECINT)+  ;

fragment
DECINT: [0-9]+ '.' [0-9]+
;

STRING: '"' (ESC|.)*? '"';
fragment
ESC:    '\\"' | '\\\\';

NOTES:      '/*' .*? '*/'               -> skip;
LINE_NOTES:    '//' .*? '\r'?'\n'       -> skip;


WS:     [ \r\n\t]+ -> skip ;
// NEWLINE:'\r'? '\n' ; //行终结