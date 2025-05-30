package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbaseUtil {
	
	
	public ResultSet readData(String query) {
		
		ResultSet dataSet = null;
		String db_url ="jdbc:postgresql://localhost:5432/dvdshop";
		String db_username="postgres";
		String db_password="admin";
		try {
			Connection connection=DriverManager.getConnection(db_url,db_username,db_password);
			
			dataSet=connection.createStatement().executeQuery(query);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dataSet;
		
		
	}

}
