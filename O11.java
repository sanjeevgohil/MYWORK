//callable statement
//note : must create procedure in oracle after written this code in java

import java.sql.*;
import java.io.*;
class O11
{
	public static void main(String args[])
	{
		CallableStatement cs1;
		Connection cn;
		int eno,s,dno;
		String enm,dnm;

		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","scott","tiger");

			System.out.print("Enter Employee No :");
			eno = Integer.parseInt(System.console().readLine());
			
			cs1 = cn.prepareCall("{Call disp1(?,?,?,?,?)}");
			cs1.setInt(1,eno);
			cs1.registerOutParameter(2, Types.VARCHAR);
			cs1.registerOutParameter(3, Types.INTEGER);
			cs1.registerOutParameter(4, Types.INTEGER);
			cs1.registerOutParameter(5, Types.VARCHAR);
			cs1.executeUpdate();

			enm= cs1.getString(2);
			s= cs1.getInt(3);
			dno= cs1.getInt(4);
			dnm= cs1.getString(5);

			System.out.println("Employee No :" +eno);
			System.out.println("Employee Name :" +enm);
			System.out.println("Employee Salary :" +s);
			System.out.println("Department No :" +dno);
			System.out.println("Department Name :" +dnm);
				
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
