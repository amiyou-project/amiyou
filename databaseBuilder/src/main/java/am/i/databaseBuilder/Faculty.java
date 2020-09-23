package am.i.databaseBuilder;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Faculty extends Employee{
	
	private String departement;
	@OneToMany(mappedBy="professor")
	private List<Course> courses;
	
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
