package dtos;



//import am.i.databaseBuilder.Coach;
import am.i.databaseBuilder.Student;

public class JobSearchReportDTO {


	private String date;

	private Student student;
	private String report;
	
	//private Coach coach;
	
	public JobSearchReportDTO() {}
	
	
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


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}
	
	
//	public Coach getCoach() {
//		return coach;
//	}
//	public void setCoach(Coach coach) {
//		this.coach = coach;
//	}
	
}
