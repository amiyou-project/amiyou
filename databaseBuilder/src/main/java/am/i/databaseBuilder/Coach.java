package am.i.databaseBuilder;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Coach extends Employee {
	
	@OneToMany(mappedBy="coach")
	private List<Student> students;
//	@OneToMany(mappedBy="coach")
//	private List<JobSearchReport> jobSearchReports;
	
	public Coach () {
		super();
	}
//
//	public List<Student> getStudents() {
//		return students;
//	}
//
//	public void setStudents(List<Student> students) {
//		this.students = students;
//	}
	
	
}
