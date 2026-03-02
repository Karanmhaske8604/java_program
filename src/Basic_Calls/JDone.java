package Basic_Calls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDone {

	public static void main(String[] args) throws SQLException {
		//Another way of connection

		Properties prop=new Properties();
		
		prop.put("user", "root");
		prop.put("password", "root");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb",prop);
		
		System.out.println(conn);
		System.out.println("Connection Successful....");
		
		
		
	}

}
