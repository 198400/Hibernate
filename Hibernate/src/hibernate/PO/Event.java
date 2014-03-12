package hibernate.PO;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Event {
	
	private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	private String title;
	
	private Date date;
	
	
	private Set users = new HashSet();
	
	
	
	public Set getUsers() {
		return users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

	public Event(){
		
	}
	
	
	
	

}
