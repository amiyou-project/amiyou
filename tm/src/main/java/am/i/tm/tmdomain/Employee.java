package am.i.tm.tmdomain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee {
	@Id
	@GeneratedValue
	private int employeeId;
	private String fname;
	private String lname;
	@Temporal(TemporalType.DATE)
	private LocalDate hiringDate;
	private int officeNo;
	private String jobDescription;

	public Employee() {
		super();
	}

	public Employee(String fname, String lname, LocalDate hiringDate, int officeNo, String jobDescription) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.hiringDate = hiringDate;
		this.officeNo = officeNo;
		this.jobDescription = jobDescription;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public LocalDate getHiringDate() {
		return hiringDate;
	}

	public void setHiringDate(LocalDate hiringDate) {
		this.hiringDate = hiringDate;
	}

	public int getOfficeNo() {
		return officeNo;
	}

	public void setOfficeNo(int officeNo) {
		this.officeNo = officeNo;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", fname=" + fname + ", lname=" + lname + ", hiringDate="
				+ hiringDate + ", officeNo=" + officeNo + ", jobDescription=" + jobDescription + "]";
	}

}
