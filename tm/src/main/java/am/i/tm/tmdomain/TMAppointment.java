
package am.i.tm.tmdomain;


import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class TMAppointment {

	@Id
	private Integer appt_Id;
	private String apptDate;
	private String localTime;
	private String checked;// value yes/no
	private Integer stud_id;
	private Integer instructor_id;
	/*
	 * @ManyToOne private Student student;
	 * 
	 * @ManyToOne private TMInstructor instructor;
	 */

	public TMAppointment() {
		super();
	}

	public TMAppointment(int appt_Id, String apptDate, String localTime, String checked, Integer stud_id,
			Integer instructor_id) {
		super();
		this.appt_Id = appt_Id;
		this.apptDate = apptDate;
		this.localTime = localTime;
		this.checked = checked;
		this.stud_id = stud_id;
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

	public String getChecked() {
		return checked;
	}

	public void setChecked(String checked) {
		this.checked = checked;
	}

	public Integer getStud_id() {
		return stud_id;
	}

	public void setStud_id(Integer stud_id) {
		this.stud_id = stud_id;
	}

	public Integer getInstructor_id() {
		return instructor_id;
	}

	public void setInstructor_id(Integer instructor_id) {
		this.instructor_id = instructor_id;
	}

	@Override
	public String toString() {
		return "TMAppointment [appt_Id=" + appt_Id + ", apptDate=" + apptDate + ", localTime=" + localTime
				+ ", checked=" + checked + ", stud_id=" + stud_id + ", instructor_id=" + instructor_id + "]";
	}

}
