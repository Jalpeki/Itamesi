package itamesi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import itamesi.util.DBConnecter;


public class LoginDAO {
	private Connection con;
	private String sql;
	private PreparedStatement ps;
	private ResultSet rs;

	public boolean select(String email,String password){
		try {
			con =DBConnecter.getConnection();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
