package am.i.databaseBuilder;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity
public class Student extends Person {

	private Date enrollDate;
	private Date gradDate;
	private float gpa;

	@ManyToOne
	private Coach coach;
	@ManyToMany
	@JoinTable(name="student_courses",
		joinColumns=@JoinColumn(name="student_id",referencedColumnName="id"),
		inverseJoinColumns=@JoinColumn(name="course_id",referencedColumnName="id"))
	private List<Course> courses;

	public Student() {}
	public Student(String name,Address add,int studentId, Date enrollDate) {
		super(name,add);
		this.enrollDate = enrollDate;
		this.gpa = 0;
		this.gradDate = null;
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
		return "Student [enrollDate=" + enrollDate + ", gradDate="
				+ gradDate + ", gpa=" + gpa + "]";
	}


}
