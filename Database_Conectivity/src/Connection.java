import java.sql.DriverManager;

public class Connection
{
public static void main(String[] args)
{
	try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=(Connection) DriverManager.getConnection( "jdbc:mysql://localhost//companey","root","root");  
		System.out.println(con);
}
	catch (Exception e) 
	{
		System.out.println(e);// TODO: handle exception
	}
}
}
