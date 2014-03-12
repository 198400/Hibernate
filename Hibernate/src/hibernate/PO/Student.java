package hibernate.PO;

import java.util.Set;

public class Student {
	
	private String sid;
	
	private String sname;
	private String sage;
	private Set book;
	
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSage() {
		return sage;
	}
	public void setSage(String sage) {
		this.sage = sage;
	}
	public Set getBook() {
		return book;
	}
	public void setBook(Set book) {
		this.book = book;
	}
	
	public Student(){
		
	}

}
