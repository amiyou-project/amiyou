package am.i.student.domain;

import java.util.Date;

import javax.persistence.Entity;

import am.i.databaseBuilder.Address;
import am.i.databaseBuilder.Person;


@Entity
public class Student extends Person {
	
	private int studentId;
	private Date enrollDate;
	private Date gradDate;
	private float gpa;
	
	public Student() {}
	public Student(String name,Address add,int studentId, Date enrollDate) {
		super(name,add);
		this.studentId = studentId;
		this.enrollDate = enrollDate;
		this.gpa = 0;
		this.gradDate = null;
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
