package itamesi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import itamesi.util.DBConnecter;


public class LoginDAO {
	private Connection con;
	private String sql;
	private PreparedStatement ps;
	private ResultSet rs;
	private int id;

	public boolean select(String email,String password){
		try {
			con = DBConnecter.getCnnection("itarian");
			System.out.println(con);
			sql = "SELECT id FROM user WHERE email = ? AND password = ?";
			ps= con.prepareStatement(sql);
			System.out.println(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			rs = ps.executeQuery();
			if(rs.next()){
				rs.getInt("id");
				setId(rs.getInt("id"));
				return true;
			}
		 }catch(SQLException e){
	            e.printStackTrace();
	        }finally{
	            if(con != null){
	                try {
	                    con.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	        return false;
	    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
