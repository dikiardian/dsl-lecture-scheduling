grammar Schedule;
model: BasicOperator Kind (Name)* (Capacity)* (Facility)*;
assign: AssignmentOperator (Name)+ Day Time;
end: OtherOperator;

BasicOperator: ('ADD') | ('DELETE') | ('UPDATE') | ('SHOW');
AssignmentOperator: ('ASSIGN');
OtherOperator: ('EXIT');
Kind: ('DOSEN') | ('RUANGAN') | ('FASILITAS') | ('MATAKULIAH');
Name: '-n '[0-9A-Za-z]+;
Facility: '-f '[A-Za-z]+;
Capacity: '-c '[0-9]+;
Day: '-d '[0-9]+;
Time: '-t '[0-9]+;
WhiteSpace: [ \t\r\n]+ -> skip;