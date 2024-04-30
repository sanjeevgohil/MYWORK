//record display using procedures 
//callabal statement

import java.sql.*;

class P9 {
    public static void main(String args[]) {
        CallableStatement cs1;
        int no;
        String nm,city;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "");

            System.out.print("Enter No: ");
            no = Integer.parseInt(System.console().readLine());

            cs1 = cn.prepareCall("{call disp(?)}");
            cs1.setInt(1, no);
            ResultSet rs = cs1.executeQuery();
            while (rs.next()) {
                System.out.println("Name: " + rs.getString(1));
                System.out.println("City: " + rs.getString(2));    
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

