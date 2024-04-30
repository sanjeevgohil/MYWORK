import java.sql.*;
import java.io.*;
class O7
{
	public static void main(String []args)
	{			
		try
		{			
			Class.forName("oracle.jdbc.driver.OracleDriver");				
			Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","scott","tiger");		
			
			Statement st = cn.createStatement();

			st.execute("insert into stud(rno,name) values(4,'sanjeev')");
			st.execute("select * from stud"); 	

			//For Preparing Resultset 
			ResultSet rs = st.getResultSet();

			System.out.println("RNO"+"  "+"Name");
			while(rs.next()){
				System.out.println(rs.getInt(1) + "    " + rs.getString(2));
			}	
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}