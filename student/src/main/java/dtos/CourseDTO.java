package dtos;

import java.util.Date;

public class CourseDTO {
	

	
	public class Course {
		
		private int id;
		private String title;
		private String building;
		private String room;
		//private Faculty professor;
		//private List<Student> students;
		private Date start;
		private Date end;
		private int ta_id;
		
		
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
		/*
		public Faculty getProfessor() {
			return professor;
		}
		public void setProfessor(Faculty professor) {
			this.professor = professor;
		}
		public List<Student> getStudents() {
			return students;
		}
		public void setStudents(List<Student> students) {
			this.students = students;
		}
		*/
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
			return ta_id;
		}
		public void setTA(int tA) {
			ta_id = tA;
		}
		
		
	}

	
	
}
