//callable statement
//note : must create procedure in oracle after written this code in java
//insert record

import java.sql.*;
import java.io.*;
class O12
{
	public static void main(String args[])
	{
		CallableStatement cs1;
		Connection cn;
		int rno;
		String nm;

		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","scott","tiger");

			System.out.print("Enter Rno :");
			rno = Integer.parseInt(System.console().readLine());
			System.out.print("Enter Name :");
			nm = System.console().readLine();
			
			cs1 = cn.prepareCall("{Call rec_insert(?,?)}");
			cs1.setInt(1,rno);
			cs1.setString(2,nm);
			cs1.executeUpdate();
				
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
