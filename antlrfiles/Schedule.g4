grammar Schedule;
model: BasicOperator Kind (Name)+ (Capacity)* (Facility)*;
assign: AssignmentOperator (Name)+ Time;
end: OtherOperator;

BasicOperator: ('ADD') | ('DELETE') | ('UPDATE');
AssignmentOperator: ('ASSIGN');
OtherOperator: ('EXIT');
Kind: ('DOSEN') | ('RUANGAN') | ('FASILITAS') | ('MATAKULIAH');
Name: '-n '[0-9A-Za-z]+;
Facility: '-f '[A-Za-z]+;
Capacity: '-c '[0-9]+;
Time: '-t '[0-9]+;
WhiteSpace: [ \t\r\n]+ -> skip;