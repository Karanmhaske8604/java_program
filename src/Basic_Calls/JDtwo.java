package Basic_Calls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDtwo {

	public static void main(String[] args) throws SQLException {
		//executeUpdate() =>return Int =>INSERT, UPDATE, DELETE, DDL =>row affected
		//Static Query =>createStatement =>slow
		
		try(
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		)
		{
			System.out.println("Connection Established...");
			
			Statement stmt=conn.createStatement();//only Static Query
		
			int rows=stmt.executeUpdate("insert into orders value(12,'Moto',1520,3),(14,'Guitar',11500,3);");
		
		System.out.println("Number of rows affected."+rows);
		
		
		
		}
	}

}
