package am.i.faculty.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Course {
	@Id
	@GeneratedValue
	private int id;
	private String building;
	private Date end;
	private String room;
	private Date start;
	private String title;
	@ManyToOne
	private Faculty professor;
	private int taId;
	@OneToMany(mappedBy="course")
	private List<Attendance> attendances;
	
	public Course() { }
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public int getTA() {
		return taId;
	}
	public void setTA(int tA) {
		taId = tA;
	}
	public void addAttendance(Attendance a) {
		this.attendances.add(a);
	}
	public Faculty getProfessor() {
		return professor;
	}

	public void setProfessor(Faculty f) {
		this.professor = f;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", building=" + building + ", end=" + end + ", room=" + room + ", start=" + start
				+ ", title=" + title + ", professor=" + professor + ", taId=" + taId + ", attendances=" + attendances
				+ "]";
	}
	
}
