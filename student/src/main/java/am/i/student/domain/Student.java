package am.i.student.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import am.i.databaseBuilder.Address;
import am.i.databaseBuilder.Coach;
import am.i.databaseBuilder.Course;
import am.i.databaseBuilder.Person;

@Entity
public class Student /* extends Person */ {

	@Id
	@GeneratedValue
	private int id;
	private int studentId;
	private String name;
	private int addressId;
	private Date enrollDate;
	private Date gradDate;
	private float gpa;
	private Integer coachId;

	public Student() {
	}



	/*
	 * public Student(String name, Address add, int studentId, Date enrollDate) {
	 * //super(name,add); this.name = name; this.addressId = add.getId();
	 * this.enrollDate = enrollDate; this.gpa = 0; this.gradDate = null; }
	 */

	public Student(String string, int addId, int studId, Date date) {
		// TODO Auto-generated constructor stub

		this.name  = string;
		this.addressId = addId;
		this.studentId = studId;
		this.enrollDate = date;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAddressId() {
		return addressId;
	}



	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}



	public Integer getCoachId() {
		return coachId;
	}



	public void setCoachId(Integer coachId) {
		this.coachId = coachId;
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
		return "Student [enrollDate=" + enrollDate + ", gradDate=" + gradDate + ", gpa=" + gpa + "]";
	}



	public int getStudentId() {
		return studentId;
	}



	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

}
