package utility;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionManager{
	public static Connection getConnection() throws Exception {
	Properties prep =loadPropertiesFile();
	
	String driver=prep.getProperty("driver");
	String url=prep.getProperty("url");
	String username=prep.getProperty("username");
	String password=prep.getProperty("password");
	
	System.out.println(driver);
	System.out.println(url);
	System.out.println(username);
	System.out.println(password);
	
	Class.forName(driver);
	Connection con;
	con=DriverManager.getConnection(url, username, password);
	return con;
	}
	public static Properties loadPropertiesFile() throws Exception {
		Properties prop = new Properties();	
		InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		prop.load(in);
		in.close(); 
		return prop;
	}
}
