package am.i.faculty.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import am.i.databaseBuilder.Student;

@Entity
public class Attendance {
	@Id
	@GeneratedValue
	private Integer id;
	private Date courseDate;

	private int sessionAttended;
	private String description;
	//private Student student;
	
	@ManyToOne
	@JoinColumn
	private Course course;
	private int studentId;
	
	public Attendance() {
		super();	
	}

	public Attendance(Date courseDate, int sessionAttended, String description, int student, Course course) {

		super();
		this.courseDate = courseDate;
		this.sessionAttended = sessionAttended;
		this.description = description;
		this.studentId = student;
		this.course = course;
	}
 
	public Date getCourseDate() {
		return courseDate;
	}
	public int getStudent() {
		return studentId;
	}
	public void setStudent(int student) {
		this.studentId = student;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public void setCourseDate(Date courseDate) {
		this.courseDate = courseDate;
	}
	public int sessionAttended() {
		return sessionAttended;
	}
	public void setAttended(int sessionAttended) {
		this.sessionAttended = sessionAttended;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Attendance [id=" + id + ", courseDate=" + courseDate + ", sessionAttended=" + sessionAttended
				+ ", description=" + description + ", course=" + course + ", studentId=" + studentId + "]";
	}


}
