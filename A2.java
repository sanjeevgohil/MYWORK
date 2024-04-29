import java.sql.*;
import java.io.*;
class A2
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			Connection cn = DriverManager.getConnection("jdbc:ucanaccess://D:/JDBC/aa.accdb");

			String sql = "select * from stud where name=?";
			
			PreparedStatement st = cn.prepareStatement(sql);
			st.setString(1,"Priya");			

			ResultSet rs = st.executeQuery();

			while(rs.next())
			{
				System.out.println(" ID : "+rs.getInt(1));
				System.out.println(" Name : "+rs.getString(2));
				System.out.println(" City : "+rs.getString(3));
				System.out.println();
			}
		}
		catch(Exception ex)
		{
				ex.printStackTrace();
		}
	}
}