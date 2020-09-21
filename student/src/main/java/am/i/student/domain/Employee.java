package am.i.student.domain;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public  abstract class Employee  extends Person{
	
	private String roomOffice ;
	
	public Employee() {}
	
	public Employee(String name,Address add, String rooOff) {
		super(name,add);
		this.roomOffice = rooOff;
	}
	
	public String getRoomOffice() {
		return roomOffice;
	}

	public void setRoomOffice(String roomOffice) {
		this.roomOffice = roomOffice;
	}
	
	

}
