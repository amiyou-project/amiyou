package am.i.databaseBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CPTReport {
	@Id
	@GeneratedValue
	private int id;
	private String enrolDate;
	private String gradDate;
	private Float gpa;
	@ManyToOne
	private Student student;
	@ManyToOne
	private Job job;
	
	public CPTReport() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEnrolDate() {
		return enrolDate;
	}
	public void setEnrolDate(String enrolDate) {
		this.enrolDate = enrolDate;
	}
	public String getGradDate() {
		return gradDate;
	}
	public void setGradDate(String gradDate) {
		this.gradDate = gradDate;
	}
	public Float getGpa() {
		return gpa;
	}
	public void setGpa(Float gpa) {
		this.gpa = gpa;
	}
	
	
}
