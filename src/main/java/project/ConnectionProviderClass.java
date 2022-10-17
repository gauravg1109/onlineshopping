package project;
import java.sql.*;
public class ConnectionProviderClass {
  public static Connection getcon() {
	  try {
		 Class.forName("com.mysql.cj.jdbc.Driver"); 
		
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_edureka","root","root");
	return con;
	  }
	  
	  catch(Exception ex) {
		  System.out.println(ex);
		  return null;
	  }
  }
}
