//1callable statement
//note : must create procedure in oracle after written this code in java
//delete record

import java.sql.*;
import java.io.*;
class O14
{
	public static void main(String args[])
	{
		CallableStatement cs1;
		Connection cn;
		int id;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","scott","tiger");

			System.out.print("Enter Id :");
			id = Integer.parseInt(System.console().readLine());

			cs1 = cn.prepareCall("{Call rec_delete(?)}");
			cs1.setInt(1,id);
			cs1.executeUpdate(); 
			
			System.out.println("Record Delete Successfully");
				
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
