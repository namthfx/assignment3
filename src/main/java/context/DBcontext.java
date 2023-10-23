package context;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBcontext {
	private final String serverName = "localhost";
	private final String dbName = "shoppingdb";
	private final String portNumber = "3306" ;
	private final String instance= null;
	private final String userId = "jsptest";
	private final String password="123456";
	private final String driver = "com.mysql.jdbc.Driver";

	public Connection getConnection() throws Exception {
		String url;
		if (instance == null) {
			url = "jdbc:mysql://" + serverName + ":" + portNumber + "/" + dbName;
		} else {
			url = "";
		}
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, userId, password);
		return DriverManager.getConnection(url, userId, password);
	}

}
