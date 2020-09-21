/*
 * package am.i.tm.tmdomain;
 * 
 * import java.time.LocalDate;
 * 
 * import javax.persistence.Entity; import javax.persistence.GeneratedValue;
 * import javax.persistence.Id; import javax.persistence.ManyToOne; import
 * javax.persistence.Temporal; import javax.persistence.TemporalType;
 * 
 * @Entity public class TMAttendance {
 * 
 * @Id
 * 
 * @GeneratedValue private int att_id; private LocalDate attDate; private String
 * session;// values=morning/afternoon private String
 * attendance;//values=present/absent
 * 
 * @ManyToOne private Student student;
 * 
 * public TMAttendance() { super(); }
 * 
 * 
 * 
 * public TMAttendance(LocalDate attDate, String session, String attendance,
 * Student student) { super(); this.attDate = attDate; this.session = session;
 * this.attendance = attendance; this.student = student; }
 * 
 * 
 * 
 * 
 * public int getAtt_id() { return att_id; }
 * 
 * 
 * 
 * public void setAtt_id(int att_id) { this.att_id = att_id; }
 * 
 * 
 * 
 * public LocalDate getAttDate() { return attDate; }
 * 
 * 
 * 
 * public void setAttDate(LocalDate attDate) { this.attDate = attDate; }
 * 
 * 
 * 
 * public String getSession() { return session; }
 * 
 * 
 * 
 * public void setSession(String session) { this.session = session; }
 * 
 * 
 * 
 * public String getAttendance() { return attendance; }
 * 
 * 
 * 
 * public void setAttendance(String attendance) { this.attendance = attendance;
 * }
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
 * @Override public String toString() { return "TMAttendance [att_id=" + att_id
 * + ", attDate=" + attDate + ", session=" + session + ", attendance=" +
 * attendance + ", student=" + student + "]"; }
 * 
 * 
 * 
 * 
 * }
 */