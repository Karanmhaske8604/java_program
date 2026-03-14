package Basic_Calls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BankAcc {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Class","root","root");
		
		Statement stmt=con.createStatement();
		con.setAutoCommit(false);
		stmt.executeUpdate("update account set balance=balance - 5000 where id=1;");
		
		stmt.executeUpdate("update account set balance=balance + 5000 where id=2;");
		
		try {
			con.commit();
			System.out.println("Transaction Successfull..");	
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			con.rollback();
			System.out.println("Transaction RollBack..");
			con.close();
		}
	}

}
