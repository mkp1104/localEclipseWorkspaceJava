package jdbc_app1;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBUtil {
	
		
		static {
			
		try
		{
				Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(ClassNotFoundException ex)
		{
			System.out.println(ex);
			
		}
		}
		public static Connection getConnection()
		{
			Connection con=null;
			try
			{
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system123");
				
				
			}
			catch(SQLException ex)
			{
				System.out.println(ex);
				
			}
			return con;
		}
		public static void closeAllConnection(ResultSet rs,Statement st,Connection con)
		{
			try
			{
				if(rs!=null)
				{
					rs.close();
					rs=null;
					
				}
				
			}
			catch(SQLException ex)
			{
				System.out.println(ex);
				
			}
			try
			{
				if(st!=null)
				{
					st.close();
					st=null;
					
				}
				
			}
			catch(SQLException ex)
			{
				System.out.println(ex);
			}
		try
		{
			if(con!=null)
			{
				con.close();
				con=null;
				
			}
			
		}
		catch(SQLException ex)
		{
			System.out.println(ex);
		}
	}
}
	