create or replace procedure disp(eno in number,enm out varchar) is

begin
	select ename into enm from emp where empno=eno;
end disp;