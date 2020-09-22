package edu.miu.team4.project.microserviceone.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String salary;
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @OneToMany(mappedBy = "job")
    private List<CptReport> cptReports=new ArrayList();

    public Job() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public boolean addCptReport(CptReport cptReport){
        boolean success = false;
        if (cptReports.add(cptReport)) {
            cptReport.setJob(this);
            success = true;
        }
        return success;
    }

    public boolean removeCptReport(CptReport cptReport){

        boolean success = false;
        if (cptReports.remove(cptReport)) {
            cptReport.setJob(null);
            success = true;
        }
        return success;
    }

    public List<CptReport> getCptReports() {
        return cptReports;
    }

    public void setCptReports(List<CptReport> cptReports) {
        this.cptReports = cptReports;
    }
}
