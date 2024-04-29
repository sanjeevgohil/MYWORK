import java.sql.*;
import java.io.*;
class O1
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","scott","tiger");

			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("select * from emp");
			while(rs.next())
			{
				System.out.print(" EMPNO : "+rs.getInt(1));
				System.out.print(" EName : "+rs.getString(2));
				System.out.print(" Job 	: "+rs.getString(3));
				System.out.print(" MGR 	: "+rs.getString(4));
				System.out.println();
			}
		}
		catch(Exception ex)
		{
				ex.printStackTrace();
		}
	}
} 