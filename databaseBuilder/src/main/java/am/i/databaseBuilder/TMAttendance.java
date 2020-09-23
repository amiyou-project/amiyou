
package am.i.databaseBuilder;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity 
public class TMAttendance {
  
  @Id
  @GeneratedValue
  private int id; 
  private String date; 
  private String session;// values=morning/afternoon
  private boolean attended;//values=present/absent
  @ManyToOne
  private Student student;
  @ManyToOne
  private TMInstructor instructor;
  
  public TMAttendance() {
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
	
	public String getSession() {
		return session;
	}
	
	public void setSession(String session) {
		this.session = session;
	}
	
	public boolean isAttended() {
		return attended;
	}
	
	public void setAttended(boolean attended) {
		this.attended = attended;
	}
	
//	public Student getStudent() {
//		return student;
//	}
//	
//	public void setStudent(Student student) {
//		this.student = student;
//	}
//	
//	public TMInstructor getInstructor() {
//		return instructor;
//	}
//	
//	public void setInstructor(TMInstructor instructor) {
//		this.instructor = instructor;
//	}
	   
  }
