
package am.i.databaseBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TMAppointment {

	@Id
	@GeneratedValue
	private int id;
	private String date;
	private String time;
	private boolean checked;
	@ManyToOne
	private Student student;
	@ManyToOne
	private TMInstructor instructor;
	
	
	public TMAppointment() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public boolean isChecked() {
		return checked;
	}


	public void setChecked(boolean checked) {
		this.checked = checked;
	}

//
//	public Student getStudent() {
//		return student;
//	}
//
//
//	public void setStudent(Student student) {
//		this.student = student;
//	}
//
//
//	public TMInstructor getInstructor() {
//		return instructor;
//	}
//
//
//	public void setInstructor(TMInstructor instructor) {
//		this.instructor = instructor;
//	}
	
	

}
