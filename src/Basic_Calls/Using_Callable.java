package Basic_Calls;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Using_Callable {
	public static void main (String [] args) throws SQLException
	{
		
		try
		
		( Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		
		 CallableStatement cs = con.prepareCall("{call zemo()}");)
		{
		 
		 ResultSet rs=cs.executeQuery();
		 
		 System.out.println("Procedure Execute Sucessfully...!");
		 
		 while(rs.next())
		 {
			    System.out.println("Id "+rs.getInt(1));
				System.out.println("Name "+rs.getString(2));
				
				System.out.println("");
		 }
		 
		}
		 
		}

}
