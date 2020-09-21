/*
 * package am.i.tm.tmdomain;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * import javax.persistence.CascadeType; import javax.persistence.Entity;
 * 
 * import javax.persistence.Id; import javax.persistence.OneToMany;
 * 
 * @Entity public class TMInstructor extends Employee{
 * 
 * @Id private int instructor_id; private String fname; private String lname;
 * private int officeNo; private String jobdescription; private int tmExprience;
 * 
 * @OneToMany(cascade = CascadeType.PERSIST) private List<Student> students =
 * new ArrayList<Student>();
 * 
 * @OneToMany(cascade = CascadeType.PERSIST) private List<TMAppointment>
 * appointments = new ArrayList<TMAppointment>();
 * 
 * @OneToMany(cascade = CascadeType.PERSIST) private List<TMAttendance>
 * attendances = new ArrayList<TMAttendance>();
 * 
 * public TMInstructor() { super(); }
 * 
 * 
 * public TMInstructor(int instructor_id, String fname, String lname, int
 * officeNo, String jobdescription, int tmExprience) { super();
 * this.instructor_id = instructor_id; this.fname = fname; this.lname = lname;
 * this.officeNo = officeNo; this.jobdescription = jobdescription;
 * this.tmExprience = tmExprience; }
 * 
 * 
 * public int getInstructor_id() { return instructor_id; }
 * 
 * 
 * public void setInstructor_id(int instructor_id) { this.instructor_id =
 * instructor_id; }
 * 
 * 
 * public String getFname() { return fname; }
 * 
 * 
 * public void setFname(String fname) { this.fname = fname; }
 * 
 * 
 * public String getLname() { return lname; }
 * 
 * 
 * public void setLname(String lname) { this.lname = lname; }
 * 
 * 
 * public int getOfficeNo() { return officeNo; }
 * 
 * 
 * public void setOfficeNo(int officeNo) { this.officeNo = officeNo; }
 * 
 * 
 * public String getJobdescription() { return jobdescription; }
 * 
 * 
 * public void setJobdescription(String jobdescription) { this.jobdescription =
 * jobdescription; }
 * 
 * 
 * public int getTmExprience() { return tmExprience; }
 * 
 * 
 * public void setTmExprience(int tmExprience) { this.tmExprience = tmExprience;
 * }
 * 
 * 
 * public List<Student> getStudents() { return students; }
 * 
 * 
 * public void setStudents(List<Student> students) { this.students = students; }
 * 
 * 
 * public List<TMAppointment> getAppointments() { return appointments; }
 * 
 * 
 * public void setAppointments(List<TMAppointment> appointments) {
 * this.appointments = appointments; }
 * 
 * 
 * public List<TMAttendance> getAttendances() { return attendances; }
 * 
 * 
 * public void setAttendances(List<TMAttendance> attendances) { this.attendances
 * = attendances; }
 * 
 * 
 * @Override public String toString() { return "TMInstructor [instructor_id=" +
 * instructor_id + ", fname=" + fname + ", lname=" + lname + ", officeNo=" +
 * officeNo + ", jobdescription=" + jobdescription + ", tmExprience=" +
 * tmExprience + ", students=" + students + ", appointments=" + appointments +
 * ", attendances=" + attendances + "]"; }
 * 
 * 
 * 
 * }
 */