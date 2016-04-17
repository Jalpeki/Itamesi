package itamesi.util;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class DBConnecter {
	public static Connection getCnnection(String database){
		String driverName = "com.mysql.jdbc.Driver";
		String url ="jdbc:mysql://localhost/";
		String user ="root";
		String pass ="mysql";
		url += database;
		Connection con = null;
		System.out.println("d"+url);
		try {
			Class.forName(driverName);
			System.out.println( "c"+driverName);
			con =(Connection)DriverManager.getConnection(url,user,pass);
			System.out.println("e" + con);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("b" +" "+con);
		return con;
	}
}
