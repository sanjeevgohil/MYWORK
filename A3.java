import java.sql.*;
class A3
{
	public static void main(String []args)
	{	
		System.out.println("Welcome To J2EE");	
		try
		{
			// For Class Driver 
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
	
			//For Connection 
			Connection cn = DriverManager.getConnection("jdbc:ucanaccess://D:/JDBC/aa.accdb");	

			//For Statement Class
			Statement st = cn.createStatement();
			
			st.execute("insert into stud(name,city) values('AAA','RJT')");
			st.execute("insert into stud(name,city) values('BBB','AMHD')");
			st.execute("select * from stud");

			//For Preparing Resultset 
			ResultSet rs = st.getResultSet();

			System.out.println("Connectoin Success");
			System.out.println("Name"+"  "+"City");
			while(rs.next()){
				System.out.println(rs.getString(2) + "    " + rs.getString(3));
			}
			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}