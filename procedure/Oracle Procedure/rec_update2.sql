create or replace procedure rec_update2(no in number ,nm in varchar2) is

begin
	update stud set name=nm where rno=no;
end rec_update2;