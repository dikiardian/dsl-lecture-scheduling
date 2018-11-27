grammar Schedule;
model: BasicOperator Kind (String)? ('(' ('nama'':'String)? (',')? ('kapasitas'':'Integer)? (',')? ('fasilitas'':'ArrayOfString)? (',')? ('sks'':'Integer)? (',')? ('tingkat'':'Integer)?')')*;
assign: AssignmentOperator (String)? ('(' 'ruang'':' String',''dosen'':'String',''hari'':'Integer',''jam'':'Integer',''durasi'':'Integer')');
end: OtherOperator;

BasicOperator: ('ADD') | ('DELETE') | ('UPDATE') | ('SHOW');
AssignmentOperator: ('ASSIGN') | ('REMOVE');
OtherOperator: ('EXIT') | ('HELP');
Kind: ('DOSEN') | ('RUANGAN') | ('FASILITAS') | ('MATAKULIAH') | ('JADWAL');
String: '"' ( ~('"') )+ '"';
Integer: [0-9]+;
ArrayOfString: '[' WhiteSpace* ('"' ( ~('"') )+ '"')+(WhiteSpace* ',' WhiteSpace* ('"' ( ~('"') )+ '"')+)* WhiteSpace* ']';
WhiteSpace: [ \t\r\n]+ -> skip;