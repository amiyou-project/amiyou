package am.i.faculty.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class StudentCourses {
	@Id
	@GeneratedValue
	private int id;
	private int studentId;
	@ManyToOne
	private Course course;
	
	public StudentCourses() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course coursesId) {
		this.course = coursesId;
	}
	
	
}
