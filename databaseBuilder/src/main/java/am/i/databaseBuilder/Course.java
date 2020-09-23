package am.i.databaseBuilder;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Course {
	@Id
	@GeneratedValue
	private int id;
	private String title;
	private String building;
	private String room;
	@ManyToOne
	private Faculty professor;
	private List<Student> students;
	private Date start;
	private Date end;
	@OneToOne
	private Student ta;
	@OneToMany(mappedBy="course")
	private List<Attendance> attendances;
	
	public Course() { }
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
//	public Student getTA() {
//		return ta;
//	}
//	public void setTA(Student tA) {
//		ta = tA;
//	}
//	public void addAttendance(Attendance a) {
//		this.attendances.add(a);
//	}	
}
