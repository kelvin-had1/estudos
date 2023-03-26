package modules.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDatabase {
	private Connection connection = null;
	
	public Connection getConnection() {
		try{
			if(this.connection != null)
				return this.connection;
			
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    String url = "jdbc:mysql://localhost/test";

		    String usuario = "root";

		    String senha = "";

		    this.connection = DriverManager.getConnection(url, usuario, senha);
		    return this.connection;
		}catch(SQLException ex) {
			

		    ex.printStackTrace();

		}catch(ClassNotFoundException error) {
			error.printStackTrace();
		}
		return connection;
	}
}
