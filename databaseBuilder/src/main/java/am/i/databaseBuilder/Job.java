package am.i.databaseBuilder;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Job {
	@Id
	@GeneratedValue
	private int id;
	private String salary;
	private String startDate;
	@OneToMany(mappedBy="job")
	private List<CPTReport> cptReports;
	@OneToOne
	private Address address;
	
	public Job() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
//	public List<CPTReport> getCptReports() {
//		return cptReports;
//	}
//	public void setCptReports(List<CPTReport> cptReports) {
//		this.cptReports = cptReports;
//	}
//	public Address getAddress() {
//		return address;
//	}
//	public void setAddress(Address address) {
//		this.address = address;
	//}
	
	
	

}
