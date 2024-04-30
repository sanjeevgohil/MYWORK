//record insert using procedures 

import java.sql.*;
import java.io.*;
class P12
{
	public static void main(String args[])
	{
		CallableStatement cs1;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","");
			System.out.print("Enter Name :");
			String nm = System.console().readLine();
			System.out.print("Enter City :");
			String ct = System.console().readLine();

			cs1 = cn.prepareCall("{call rec_insert(?,?)}");
			cs1.setString(1,nm);
			cs1.setString(2,ct);
			cs1.executeUpdate(); 
			System.out.println("Record Insert Successfully");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
