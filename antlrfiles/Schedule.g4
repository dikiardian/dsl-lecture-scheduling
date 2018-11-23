grammar Schedule;
model: BasicOperator Kind (Name)* ('('('kapasitas'':'Capacity)* (',''fasilitas'':'Facility)* (',''sks'':'Sks)* (',''tingkat'':'Tingkat)*')')*;
assign: AssignmentOperator (Name)+ ('(' 'ruang'':'Class ',' 'dosen'':'Dosen' ',' 'hari'':'Day' ',' 'jam'':'Time')');
end: OtherOperator;

BasicOperator: ('ADD') | ('DELETE') | ('UPDATE') | ('SHOW');
AssignmentOperator: ('ASSIGN');
OtherOperator: ('EXIT');
Kind: ('DOSEN') | ('RUANGAN') | ('FASILITAS') | ('MATAKULIAH');
Name: '"' ( ~('"') )+ '"';
Class: [0-9A-Za-z]+;
Dosen: '"' ( ~('"') )+ '"';
Capacity: [0-9]+;
Facility: '[' WhiteSpace* ('"' ( ~('"') )+ '"')+(WhiteSpace* ',' WhiteSpace* ('"' ( ~('"') )+ '"')+)* WhiteSpace* ']';
Sks: [0-9]+;
Tingkat: [0-9]+;
Day: [0-9]+;
Time: [0-9]+;
WhiteSpace: [ \t\r\n]+ -> skip;