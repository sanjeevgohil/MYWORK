import java.sql.*;
class O4
{
	public static void main(String []args)
	{	
		System.out.println("Welcome To J2EE");	
		try
		{
			// For Class Driver 
			Class.forName("oracle.jdbc.driver.OracleDriver");
	
			//For Connection 
			Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","scott","tiger");		

			//For Statement Class
			Statement st = cn.createStatement();
			
			st.execute("update stud set name='Sanjeev' where rno=1");
			st.execute("select * from stud");

			//For Preparing Resultset 
			ResultSet rs = st.getResultSet();

			System.out.println("Connectoin Success");
			System.out.println("RollNo"+"  "+"Name");
			while(rs.next()){
				System.out.println(rs.getInt(1) + "    " + rs.getString(2));
			}			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}