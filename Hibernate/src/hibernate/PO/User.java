package hibernate.PO;

import java.util.HashSet;
import java.util.Set;

public class User {
	
	private int userid; // 用户ID
	
	private String userName; // 用户姓名
	
	private String userPwd; // 密码
	
	private int rodxid; // 权限
	
	private Set events  = new HashSet();
	
	public Set getEvents() {
		return events;
	}

	public void setEvents(Set events) {
		this.events = events;
	}

	public int getUserid() {
		
		return userid;
		
	}
	
	public void setUserid(int userid) {
		
		this.userid = userid;
		
	}
	
	public String getUserName() {
		
		return userName;
		
	}
	
	public void setUserName(String userName) {
		
		this.userName = userName;
		
	}
	
	public String getUserPwd() {
		
		return userPwd;
	}
	
	public void setUserPwd(String userPwd) {
		
		this.userPwd = userPwd;
		
	}
	public int getRodxid() {
		
		return rodxid;
		
	}
	public void setRodxid(int rodxid) {
		
		this.rodxid = rodxid;
		
	}
	
	
	

}
