package am.i.student.domain;

import javax.persistence.Entity;

@Entity
public class Faculty extends Employee{
	
	private String departement;
	
	public Faculty() {}
	
	public Faculty(String name,String room,String departement,Address add) {
		//super(name,room);
		this.setName(name);
		this.setRoomOffice(room);
		this.departement = departement;
		this.setAddress(add);
	}

	
	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}
}
