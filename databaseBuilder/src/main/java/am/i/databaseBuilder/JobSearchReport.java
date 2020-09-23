package am.i.databaseBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class JobSearchReport {
	@Id
	@GeneratedValue
	private int id;
	private String date;
	@ManyToOne
	private Student student;
	private String report;
	@ManyToOne
	private Coach coach;
	
	public JobSearchReport() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
//	public Student getStudent() {
//		return student;
//	}
//	public void setStudent(Student student) {
//		this.student = student;
//	}
	public String getReport() {
		return report;
	}
	public void setReport(String report) {
		this.report = report;
	}
//	public Coach getCoach() {
//		return coach;
//	}
//	public void setCoach(Coach coach) {
//		this.coach = coach;
//	}
	
	
}
