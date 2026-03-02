package Basic_Calls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Third {

	public static void main(String[] args) throws SQLException {
		
		try(Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
				PreparedStatement stmt=conn.prepareStatement("insert into orders value(9,'TAB',45000,1);");
				PreparedStatement stmt1=conn.prepareStatement("select * from orders where o_id=9;");
				)
				{
					boolean flag=stmt1.execute();
					if(flag)
					{
						System.out.println("DQL");
						ResultSet rs=stmt1.getResultSet();
						while(rs.next())
						{
							System.out.println("O_ID: "+rs.getInt("o_id"));
							System.out.println("OName: "+rs.getString("o_name"));
							System.out.println("O_price: "+rs.getInt("o_price"));
							System.out.println("  ");
						}
						
					}
					else
					{
						System.out.println("DML");
						int n=stmt1.getUpdateCount();
						System.out.println("Affected rows no:"+n);
					}
				}
			}

	}


