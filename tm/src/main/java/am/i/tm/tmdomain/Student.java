package am.i.tm.tmdomain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Student {
	@Id
	private int studId;
	private String fname;
	private String lname;
	@Temporal(TemporalType.DATE)
	private LocalDate enrollmentDate;
	@Temporal(TemporalType.DATE)
	private LocalDate gradDate;
	private Double GPA;

	public Student() {
		super();
	}

	public Student(String fname, String lname, LocalDate enrollmentDate, LocalDate gradDate, Double gPA) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.enrollmentDate = enrollmentDate;
		this.gradDate = gradDate;
		GPA = gPA;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
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

	public LocalDate getEnrollmentDate() {
		return enrollmentDate;
	}

	public void setEnrollmentDate(LocalDate enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}

	public LocalDate getGradDate() {
		return gradDate;
	}

	public void setGradDate(LocalDate gradDate) {
		this.gradDate = gradDate;
	}

	public Double getGPA() {
		return GPA;
	}

	public void setGPA(Double gPA) {
		GPA = gPA;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", fname=" + fname + ", lname=" + lname + ", enrollmentDate="
				+ enrollmentDate + ", gradDate=" + gradDate + ", GPA=" + GPA + "]";
	}

}
