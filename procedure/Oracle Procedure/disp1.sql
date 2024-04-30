create or replace procedure disp1(eno in number,enm out varchar,s out number,dno out number,dnm out varchar) is

begin
	select e.ename,e.sal,d.deptno,d.dname into enm,s,dno,dnm from emp e,dept d where e.deptno = d.deptno and e.empno=&eno;
end disp1;