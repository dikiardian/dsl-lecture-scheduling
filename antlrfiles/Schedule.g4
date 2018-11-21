grammar Schedule;
schedule: OPERATOR OPERAND OPERAND;
OPERATOR: ('ADD') | ('MUL');
OPERAND: [0-9]+;
WHITESPACE: [ \t\r\n]+ -> skip;