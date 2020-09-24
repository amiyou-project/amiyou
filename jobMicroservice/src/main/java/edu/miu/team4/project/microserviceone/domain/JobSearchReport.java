package edu.miu.team4.project.microserviceone.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class JobSearchReport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Temporal(TemporalType.DATE)
    private Date date;
    private int studentid;
    @Column(length = 100)
    private String report;

    public JobSearchReport() {
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

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }
}
