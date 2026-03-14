package Basic_Calls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FirstConnect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		
		try(Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		)
		{
		System.out.println(conn);
		System.out.println("Connection found...");
		
		PreparedStatement stmt=conn.prepareStatement("select * from orders;");
		ResultSet rs=stmt.executeQuery();
		
		while(rs.next())
		{
			System.out.println("O_ID: "+rs.getInt(1));
			System.out.println("OName: "+rs.getString(2));
			System.out.println("O_price: "+rs.getInt(3));
			System.out.println("  ");
		}
		
	}
	}
}