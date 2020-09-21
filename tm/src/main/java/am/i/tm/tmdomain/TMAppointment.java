
package am.i.tm.tmdomain;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TMAppointment {

	@Id
	@GeneratedValue
	private int appt_Id;
	private String apptDate;
	private String localTime;
	private boolean checked;
	//@ManyToOne
	private int student_id;
	private String instructor_id;
	
	
	public TMAppointment() {
		super();
	}


	public TMAppointment(int appt_Id, String apptDate, String localTime, boolean checked, int student_id,
			String instructor_id) {
		super();
		this.appt_Id = appt_Id;
		this.apptDate = apptDate;
		this.localTime = localTime;
		this.checked = checked;
		this.student_id = student_id;
		this.instructor_id = instructor_id;
	}


	public int getAppt_Id() {
		return appt_Id;
	}


	public void setAppt_Id(int appt_Id) {
		this.appt_Id = appt_Id;
	}


	public String getApptDate() {
		return apptDate;
	}


	public void setApptDate(String apptDate) {
		this.apptDate = apptDate;
	}


	public String getLocalTime() {
		return localTime;
	}


	public void setLocalTime(String localTime) {
		this.localTime = localTime;
	}


	public boolean isChecked() {
		return checked;
	}


	public void setChecked(boolean checked) {
		this.checked = checked;
	}


	public int getStudent_id() {
		return student_id;
	}


	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}


	public String getInstructor_id() {
		return instructor_id;
	}


	public void setInstructor_id(String instructor_id) {
		this.instructor_id = instructor_id;
	}


	@Override
	public String toString() {
		return "TMAppointment [appt_Id=" + appt_Id + ", apptDate=" + apptDate + ", localTime=" + localTime
				+ ", checked=" + checked + ", student_id=" + student_id + ", instructor_id=" + instructor_id + "]";
	}
	
	


	

}
