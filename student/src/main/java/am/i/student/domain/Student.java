package am.i.student.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private int id;
	
	private int studentId;
	private Date enrollDate;
	private Date gradDate;
	private float gpa;
	
	public Student() {}
	public Student(int studentId, Date enrollDate) {
		super();
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentId=" + studentId + ", enrollDate=" + enrollDate + ", gradDate="
				+ gradDate + ", gpa=" + gpa + "]";
	}
	
	
}
