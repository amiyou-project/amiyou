
package am.i.tm.tmdomain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class TMInstructor {

	@Id
	private Integer id;
	private String fname;
	private String lname;
	private Integer officeNo;
	private String jobdescription;
	private Integer tmExprience;
	private Integer stud_id;
	// @OneToMany
	// private List<Student>students=new ArrayList<Student>();

	/*
	 * @OneToMany(cascade = CascadeType.PERSIST) private List<Studentdd> students =
	 * new ArrayList<Studentdd>();
	 * 
	 * @OneToMany(cascade = CascadeType.PERSIST) private List<TMAppointment>
	 * appointments = new ArrayList<TMAppointment>();
	 * 
	 * @OneToMany(cascade = CascadeType.PERSIST) private List<TMAttendance>
	 * attendances = new ArrayList<TMAttendance>();
	 */
	public TMInstructor() {
		super();
	}

	
	public TMInstructor(Integer id, String fname, String lname, Integer officeNo, String jobdescription,
			Integer tmExprience, Integer stud_id) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.officeNo = officeNo;
		this.jobdescription = jobdescription;
		this.tmExprience = tmExprience;
		this.stud_id = stud_id;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public Integer getOfficeNo() {
		return officeNo;
	}


	public void setOfficeNo(Integer officeNo) {
		this.officeNo = officeNo;
	}


	public String getJobdescription() {
		return jobdescription;
	}


	public void setJobdescription(String jobdescription) {
		this.jobdescription = jobdescription;
	}


	public Integer getTmExprience() {
		return tmExprience;
	}


	public void setTmExprience(Integer tmExprience) {
		this.tmExprience = tmExprience;
	}


	public Integer getstud_id() {
		return stud_id;
	}


	public void setstud_id(Integer stud_id) {
		this.stud_id = stud_id;
	}


	@Override
	public String toString() {
		return "TMInstructor [id=" + id + ", fname=" + fname + ", lname=" + lname + ", officeNo=" + officeNo
				+ ", jobdescription=" + jobdescription + ", tmExprience=" + tmExprience + ", stud_id=" + stud_id + "]";
	}


	

}
