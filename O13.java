//1callable statement
//note : must create procedure in oracle after written this code in java
//update record

import java.sql.*;
import java.io.*;
class O13
{
	public static void main(String args[])
	{
		CallableStatement cs1;
		Connection cn;
		int no;
		String nm;

		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","scott","tiger");

			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("select * from stud");
			
			while(rs.next())
			{
				System.out.println("Rno :" +rs.getInt(1));
				System.out.println("Name :" +rs.getString(2));
				System.out.println();
			}	

			System.out.print("Enter Rno :");
			no = Integer.parseInt(System.console().readLine());
			System.out.print("Enter Name :");
			nm = System.console().readLine();
			
			cs1 = cn.prepareCall("{Call rec_update2(?,?)}");
			cs1.setInt(1,no);
			cs1.setString(2,nm);
			cs1.executeUpdate();

			System.out.println("Rno :" +no);
			System.out.println("Name :" +nm);
			System.out.println();
				
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
