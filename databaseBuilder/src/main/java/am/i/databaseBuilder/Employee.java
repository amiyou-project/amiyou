package am.i.databaseBuilder;

import javax.persistence.Entity;
@Entity
public  abstract class Employee  extends Person{
	private String roomOffice ;
	private String hiringDate;
	private String responsabilityDesc;
	
	public Employee() {}
	
	public String getHiringDate() {
		return hiringDate;
	}

	public void setHiringDate(String hiringDate) {
		this.hiringDate = hiringDate;
	}



	public String getResponsabilityDesc() {
		return responsabilityDesc;
	}



	public void setResponsabilityDesc(String responsabilityDesc) {
		this.responsabilityDesc = responsabilityDesc;
	}



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
