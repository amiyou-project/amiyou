/*
 * package am.i.tm.tmdomain;
 * 
 * import java.time.LocalDate; import java.time.LocalTime;
 * 
 * import javax.persistence.Entity; import javax.persistence.GeneratedValue;
 * import javax.persistence.Id; import javax.persistence.ManyToOne;
 * 
 * @Entity public class TMAppointment {
 * 
 * @Id
 * 
 * @GeneratedValue private int appt_Id; private LocalDate apptDate; private
 * LocalTime localTime; private boolean checked;
 * 
 * @ManyToOne private Student student;
 * 
 * 
 * public TMAppointment() { super(); }
 * 
 * 
 * 
 * public TMAppointment(LocalDate apptDate, LocalTime localTime, boolean
 * checked, Student student) { super();
 * 
 * this.apptDate = apptDate; this.localTime = localTime; this.checked = checked;
 * this.student = student; }
 * 
 * 
 * 
 * public int getAppt_Id() { return appt_Id; }
 * 
 * 
 * 
 * public void setAppt_Id(int appt_Id) { this.appt_Id = appt_Id; }
 * 
 * 
 * 
 * public LocalDate getApptDate() { return apptDate; }
 * 
 * 
 * 
 * public void setApptDate(LocalDate apptDate) { this.apptDate = apptDate; }
 * 
 * 
 * 
 * public LocalTime getLocalTime() { return localTime; }
 * 
 * 
 * 
 * public void setLocalTime(LocalTime localTime) { this.localTime = localTime; }
 * 
 * 
 * 
 * public boolean isChecked() { return checked; }
 * 
 * 
 * 
 * public void setChecked(boolean checked) { this.checked = checked; }
 * 
 * 
 * 
 * public Student getStudent() { return student; }
 * 
 * 
 * 
 * public void setStudent(Student student) { this.student = student; }
 * 
 * 
 * 
 * @Override public String toString() { return "TMAppointment [appt_Id=" +
 * appt_Id + ", apptDate=" + apptDate + ", localTime=" + localTime +
 * ", checked=" + checked + ", student=" + student + "]"; }
 * 
 * 
 * 
 * 
 * }
 */