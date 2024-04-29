import java.sql.*;
import java.io.*;
class P1
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");	
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ns","root","");
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("select * from register");
			while(rs.next())
			{
				System.out.println(" ID : "+rs.getInt(1));
				System.out.print(" Name : "+rs.getString(2));
				System.out.print(" City : "+rs.getString(3));
				System.out.println();
			}
		}
		catch(Exception ex)
		{
				ex.printStackTrace();
		}
	}
}