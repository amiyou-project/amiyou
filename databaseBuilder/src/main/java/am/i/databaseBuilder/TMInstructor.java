
package am.i.databaseBuilder;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class TMInstructor extends Employee {
	private int tmExprience;
	@OneToMany(mappedBy="instructor")
	private List<TMAttendance> attendances;
	@OneToMany(mappedBy="instructor")
	private List<TMAppointment> appointments;
	
	public TMInstructor() {
		super();
	}

	public int getTmExprience() {
		return tmExprience;
	}

	public void setTmExprience(int tmExprience) {
		this.tmExprience = tmExprience;
	}

//	public List<TMAttendance> getAttendances() {
//		return attendances;
//	}
//
//	public void setAttendances(List<TMAttendance> attendances) {
//		this.attendances = attendances;
//	}
//
//	public List<TMAppointment> getAppointments() {
//		return appointments;
//	}
//
//	public void setAppointments(List<TMAppointment> appointments) {
//		this.appointments = appointments;
//	}
	
}
