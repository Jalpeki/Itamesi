package itamesi.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import itamesi.dao.LoginDAO;

public class LoginAction extends ActionSupport implements SessionAware{
	private String email;
	private String password;
	private Map<String, Object> session;
	private String Message;


	public String execute(){
		LoginDAO dao = new LoginDAO();
		if(!dao.select(email,password)){
			setMessage("メールアドレスまたは、パスワードが間違っています");
			return ERROR;
		}
		session.put("id", dao.getId());
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public String getMessage() {
		return Message;
	}


	public void setMessage(String message) {
		this.Message = message;
	}





}
