package jdbcinsertDemo;

import java.sql.Connection;
import java.sql.DriverManager;

public class insertdemo {
	static Connection connection = null;
public static void main(String[] args) {
		
	try{
	//load the jdbc driver 
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/mydatabase";
		String username = "Lalit";
		String password ="Wagh";
		
		connection = DriverManager.getConnection(url,username,password);
		//use the connection to perform the database operation
		System.out.println("connection established sucessfully!");

}
	catch(Exception ex) {
		ex.printStackTrace();
}return ;
}
}