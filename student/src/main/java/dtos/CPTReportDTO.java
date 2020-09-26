package dtos;



import am.i.databaseBuilder.Job;
import am.i.databaseBuilder.Student;

public class CPTReportDTO {

	
	private int id;
	private String enrolDate;
	private String gradDate;
	private Float gpa;
	private String report;

	
	public CPTReportDTO() {}
	
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

	public String getReport() {
		return report;
	}

	public void setReport(String report) {
		this.report = report;
	}
	
}
