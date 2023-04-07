package com.hdfc.doctor.repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DoctorRepoDBUtill {

private static Connection conn = null;
	
	public static Connection getDBConnection() {

		

		
		try {
			

			FileReader fr = new FileReader("src/main/resources/application.properties");

			Properties prop = new Properties();

			prop.load(fr);

			String driver = prop.getProperty("driver.classname");

			
			String url = prop.getProperty("url");
			String username = prop.getProperty("username");
			String password = prop.getProperty("password");

			
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);

		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		return conn;

	}

}
