package am.i.faculty.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Attendance {
	@Id
	@GeneratedValue
	private Integer id;
	private Date courseDate;
	private boolean isAttended;
	private String description;
	private int student_id;
	@ManyToOne
	private Course course;
	
	public Attendance() {
		super();	
	}
	
	public Attendance(Date courseDate, boolean isAttended, String description, int student_id, Course course) {
		super();
		this.courseDate = courseDate;
		this.isAttended = isAttended;
		this.description = description;
		this.student_id = student_id;
		this.course = course;
	}

	public Date getCourseDate() {
		return courseDate;
	}
	public int getStudent() {
		return student_id;
	}
	public void setStudent(int student) {
		this.student_id = student;
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
	public boolean isAttended() {
		return isAttended;
	}
	public void setAttended(boolean isAttended) {
		this.isAttended = isAttended;
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


}
