package hibernate.PO;

import java.util.HashSet;
import java.util.Set;

public class User {
	
	private int userid; // �û�ID
	
	private String userName; // �û�����
	
	private String userPwd; // ����
	
	private int rodxid; // Ȩ��
	
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
