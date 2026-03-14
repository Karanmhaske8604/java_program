package Basic_Calls;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableState {

	public static void main(String[] args) throws SQLException {
		
		try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		)
		//System.out.println(con);
		{
		CallableStatement call=con.prepareCall("find zemo();");
		
		ResultSet rs=call.executeQuery();
		
		while(rs.next())
		{
			System.out.println("Id "+rs.getInt(1));
			System.out.println("Name "+rs.getString(2));
			System.out.println("City "+rs.getString(3));
			System.out.println("");
			
		}
		
		
		
		}
	}

}
