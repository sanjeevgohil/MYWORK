create or replace procedure rec_delete(id in number) is

begin
	delete from stud where rno=id;
end rec_delete;