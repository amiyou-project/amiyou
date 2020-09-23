package dtos;


import java.util.Date;
import java.util.List;

//import am.i.databaseBuilder.Student;
import am.i.faculty.domain.Faculty;
import am.i.student.domain.Student;

//import am.i.databaseBuilder.Faculty;




public class CourseDTO {
	
	private String title;
	private String building;
	private String room;

	private Faculty professor;
	
	private Date start;
	private Date end;
	
	private Student ta;

	
	public CourseDTO() { }
	
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
	
	
	  public Student getTA() { return ta; } public void setTA(Student tA) { ta =
	  tA; }
	 
	 

	public Faculty getProfessor() {
		return professor;
	}

	public void setProfessor(Faculty professor) {
		this.professor = professor;
	}

	
		
}
