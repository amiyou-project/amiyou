
package am.i.tm.tmdomain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class TMAttendance {

	@Id
	private Integer attendance_id;
	private String attDate;
	private String session;// values=morning/afternoon
	private String attendance;// values=present/absent
	private Integer stud_id;
	private Integer instructor_id;
	/*
	 * @ManyToOne private Student student;
	 * 
	 * @ManyToOne private TMInstructor instructor;
	 */

	public TMAttendance() {
		super();
	}

	public TMAttendance(int attendance_id, String attDate, String session, String attendance, Integer stud_id,
			Integer instructor_id) {
		super();
		this.attendance_id = attendance_id;
		this.attDate = attDate;
		this.session = session;
		this.attendance = attendance;
		this.stud_id = stud_id;
		this.instructor_id = instructor_id;
	}

	public int getAttendance_id() {
		return attendance_id;
	}

	public void setAttendance_id(int attendance_id) {
		this.attendance_id = attendance_id;
	}

	public String getAttDate() {
		return attDate;
	}

	public void setAttDate(String attDate) {
		this.attDate = attDate;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public String getAttendance() {
		return attendance;
	}

	public void setAttendance(String attendance) {
		this.attendance = attendance;
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
		return "TMAttendance [attendance_id=" + attendance_id + ", attDate=" + attDate + ", session=" + session
				+ ", attendance=" + attendance + ", stud_id=" + stud_id + ", instructor_id=" + instructor_id + "]";
	}

}
