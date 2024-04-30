import java.sql.*;
class P8
{
	public static void main(String []args)
	{	
		System.out.println("Welcome To J2EE");	
		try
		{
			
			// For Class Driver 
			Class.forName("com.mysql.jdbc.Driver");
			//For Connection 
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","");		
			Statement st = cn.createStatement();

			st.execute("delete from stud where id=5");
			st.execute("select * from stud"); 	

			//For Preparing Resultset 
			ResultSet rs = st.getResultSet();

			System.out.println("ID"+"  "+"Name"+"  "+"City");
			while(rs.next()){
				System.out.println(rs.getInt(1) + "    " + rs.getString(2)+ "    " + rs.getString(3));
			}			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}