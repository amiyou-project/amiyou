package am.i.faculty.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Faculty{
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int addressId;
	private String hiringDate;
	private String responsabilityDesc;
	private String roomOffice;
	private String departement;
	
	public Faculty() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

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

	public String getRoomOffice() {
		return roomOffice;
	}

	public void setRoomOffice(String roomOffice) {
		this.roomOffice = roomOffice;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}
	
	
}
