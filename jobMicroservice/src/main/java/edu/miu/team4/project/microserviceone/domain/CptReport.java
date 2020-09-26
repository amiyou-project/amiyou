package edu.miu.team4.project.microserviceone.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class CptReport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Temporal(TemporalType.DATE)
    private Date date;
    @Column(length = 150)
    private String report;
    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;
    @Column
    private int studentnum;


    public CptReport() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public int getStudentnum() {
        return studentnum;
    }

    public void setStudentnum(int studentnum) {
        this.studentnum = studentnum;
    }

	public CptReport(long id, Date date, String report, Job job, int studentnum) {
		super();
		this.id = id;
		this.date = date;
		this.report = report;
		this.job = job;
		this.studentnum = studentnum;
	}
    
    
}
