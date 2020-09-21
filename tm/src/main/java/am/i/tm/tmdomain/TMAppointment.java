package am.i.tm.tmdomain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class TMAppointment {
	@Id
	@GeneratedValue
	private int apptId;
	@Temporal(TemporalType.DATE)
	private LocalDate apptDate;
	@Temporal(TemporalType.TIME)
	private LocalDate apptTime;
	private boolean checked;

	public TMAppointment() {
		super();
	}

	public TMAppointment(LocalDate apptDate, LocalDate apptTime, boolean checked) {
		super();
		
		this.apptDate = apptDate;
		this.apptTime = apptTime;
		this.checked = checked;
	}

	public int getApptId() {
		return apptId;
	}

	public LocalDate getApptDate() {
		return apptDate;
	}

	public void setApptDate(LocalDate apptDate) {
		this.apptDate = apptDate;
	}

	public LocalDate getApptTime() {
		return apptTime;
	}

	public void setApptTime(LocalDate apptTime) {
		this.apptTime = apptTime;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	@Override
	public String toString() {
		return "TMAppointment [apptId=" + apptId + ", apptDate=" + apptDate + ", apptTime=" + apptTime + ", checked="
				+ checked + "]";
	}

}
