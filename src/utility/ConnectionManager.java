package utility;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager{
	public static Connection getConnection() throws SQLException {
		@SuppressWarnings("unused")
		Connection con=null;
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Purnima");
				
		return null;
		
	}
	public static Properties loadPropertiesFile() throws Exception {
		Properties prop = new Properties();	
		InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		prop.load(in);
		in.close(); 
		return prop;
	}
}

