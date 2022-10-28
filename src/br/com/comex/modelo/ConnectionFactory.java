package br.com.comex.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:oracle:thin:172.17.0.2:1522:xe", "comex", "comex");
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
}
