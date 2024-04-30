//record upadate  using procedures 

import java.sql.*;
import java.io.*;
class P11
{
	public static void main(String args[])
	{
		CallableStatement cs1;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","");
			System.out.print("Enter Rno :");
			int no = Integer.parseInt(System.console().readLine());
			System.out.print("Enter Name :");
			String nm = System.console().readLine();
			System.out.print("Enter City :");
			String ct = System.console().readLine();

			cs1 = cn.prepareCall("{call rec_update(?,?,?)}");
			cs1.setInt(1,no);
			cs1.setString(2,nm);
			cs1.setString(3,ct);
			cs1.executeUpdate(); 
			System.out.println("Record update Successfully");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
