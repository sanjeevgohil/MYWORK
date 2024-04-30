create or replace procedure rec_insert(rno in number,nm in varchar2) is

begin
	insert into stud(rno,name)values(rno,nm);
end rec_insert;