package Basic_Calls;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallbleEx1 {

	public static void main(String[] args) throws SQLException {

		try
		( Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Practice","root","root");
		
		 CallableStatement cs = con.prepareCall("{call getstudent(?)}");)
		{
	     cs.setInt(1, 1);

          ResultSet rs = cs.executeQuery();

             while(rs.next())
             {
        System.out.println(rs.getInt(1) + " " + rs.getString(2));
		}
	  }
	}
}


