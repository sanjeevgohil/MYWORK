import java.sql.*;
import java.io.*;
class O6
{
	public static void main(String []args)
	{	
		Statement st;
		ResultSet rs;		
		try
		{			
			Class.forName("oracle.jdbc.driver.OracleDriver");				
			Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","scott","tiger");		
			
			st = cn.createStatement();
			st.execute("create  table stud(rno number,name varchar2(20))");
			st.execute("insert into stud values(1,'Karan')");
			st.execute("select * from stud");
			rs = st.getResultSet();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"   "+rs.getString(2));	
			}
			cn.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}