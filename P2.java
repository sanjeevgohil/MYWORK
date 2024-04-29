import java.sql.*;
class P2
{
	public static void main(String []args)
	{	
		System.out.println("Welcome To J2EE");	
		try
		{
			// For Class Driver 
			Class.forName("com.mysql.jdbc.Driver");
			//For Connection 
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ns","root","");

			String sql = "select * from register where name=?";
			
			PreparedStatement st = cn.prepareStatement(sql);
			st.setString(1,"BBB");			

			ResultSet rs = st.executeQuery();

			System.out.println("Connectoin Success");
			System.out.println("ID"+"  "+"Name"+"  "+"EMail"+"  "+"Mobile");
			while(rs.next())
			{
				System.out.println(rs.getInt(1) + "    " + rs.getString(2)+ "    " + rs.getString(3)+ "    " + rs.getInt(4));
			}
			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}









