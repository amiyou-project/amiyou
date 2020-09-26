package DTO;

import java.util.Date;

public class Student{
	
	private int studentId;
	private Date enrollDate;
	private Date gradDate;
	private float gpa;
	
	public Student() {}
	
	
	public Student(int studentId, Date enrollDate, Date gradDate, float gpa) {
		super();
		this.studentId = studentId;
		this.enrollDate = enrollDate;
		this.gradDate = gradDate;
		this.gpa = gpa;
	}


	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public Date getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}
	public Date getGradDate() {
		return gradDate;
	}
	public void setGradDate(Date gradDate) {
		this.gradDate = gradDate;
	}
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", enrollDate=" + enrollDate + ", gradDate="
				+ gradDate + ", gpa=" + gpa + "]";
	}
	
	
}
