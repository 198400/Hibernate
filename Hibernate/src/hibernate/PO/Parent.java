package hibernate.PO;

import java.util.Set;

public class Parent {
	
	private long id;
	
	private Set children;
	
	public long getId(){
		return id;
	}
	
	private Set getChildren(){return children;}
	
	private void setChildren(Set children){
		this.children = children;
	}

}
