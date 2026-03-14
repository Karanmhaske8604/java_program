package Basic_Calls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Second {

	public static void main(String[] args) throws SQLException   {
//	
//		String url="jdbc:mysql://localhost:3306/mydb";
//		String user="root";
//		String password="root";
//		
//		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306:mydb",
				"root","root");
		System.out.println(conn);
		
		Statement stmt=conn.createStatement();
		
	//	int rows=stmt.executeUpdate("insert into orders value(8,'Appple',45.63,2);");
		
	//	System.err.println("rows affected:"+rows);
		System.out.println("Connnected Successfully...");
		
		

	}

}
