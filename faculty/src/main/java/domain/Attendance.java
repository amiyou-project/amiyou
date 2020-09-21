package domain;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Attendance {
	@Id
	@GeneratedValue
	private Integer id;
	private Date courseDate;
	private boolean isAttended;
	private String description;
		
	
	
	
	public Attendance(Integer id, Date courseDate, boolean isAttended, String description) {
		super();
		this.id = id;
		this.courseDate = courseDate;
		this.isAttended = isAttended;
		this.description = description;
	}
	public Date getCourseDate() {
		return courseDate;
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
