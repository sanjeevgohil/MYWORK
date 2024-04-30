//callable statement
//note : must create procedure in oracle after written this code in java

import java.sql.*;
import java.io.*;
class O10
{
	public static void main(String args[])
	{
		CallableStatement cs1;
		Connection cn;
		int eno;
		String str,nm;

		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","scott","tiger");

			System.out.print("Enter Employee No :");
			eno = Integer.parseInt(System.console().readLine());
			
			cs1 = cn.prepareCall("{Call disp(?,?)}");
			cs1.setInt(1,eno);
			cs1.registerOutParameter(2, Types.VARCHAR);
			cs1.executeUpdate();

			nm= cs1.getString(2);
			System.out.println("Employee Name :" +nm);
				
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}