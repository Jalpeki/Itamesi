package itamesi.util;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class DBConnecter {
	public static Connection getCnnection(String database){
		String driverName = "com.mysql.jdbcDriver";
		String url ="jdbc:mysql://localhost/";
		String user ="root";
		String pass ="mysql";
		url += database;
		Connection con = null;
		try {
			Class.forName(driverName);
			con =(Connection)DriverManager.getConnection(url,user,pass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
