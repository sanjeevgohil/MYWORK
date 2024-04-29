import java.sql.*;
class O2
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

			String sql = "select * from stud where rno=?";
			
			PreparedStatement st = cn.prepareStatement(sql);
			st.setInt(1,1);			

			ResultSet rs = st.executeQuery();

			System.out.println("Rno"+"  "+"Name");
			while(rs.next())
			{
				System.out.println(rs.getInt(1) + "    " + rs.getString(2));
			}
			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}








