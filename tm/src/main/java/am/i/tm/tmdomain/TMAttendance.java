package am.i.tm.tmdomain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class TMAttendance {
	@Id
	@GeneratedValue
	private int recId;
	@Temporal(TemporalType.DATE)
	private LocalDate attDate;
	private String session;// values=morning/afternoon
	private String attendance;// values=present/absent

	public TMAttendance() {
		super();
	}

	public TMAttendance(LocalDate attDate, String session, String attendance) {
		super();
		this.attDate = attDate;
		this.session = session;
		this.attendance = attendance;
	}

	public int getRecId() {
		return recId;
	}

	public LocalDate getAttDate() {
		return attDate;
	}

	public void setAttDate(LocalDate attDate) {
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

	@Override
	public String toString() {
		return "TMAttendance [recId=" + recId + ", session=" + session + ", attendance=" + attendance + "]";
	}

}
