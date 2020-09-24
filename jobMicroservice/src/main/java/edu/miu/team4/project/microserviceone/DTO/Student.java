package edu.miu.team4.project.microserviceone.DTO;

import java.util.Date;

public class Student {
    private int id;
    private int studentId;
    private Date enrollDate;
    private Date gradDate;
    private float gpa;
    private long coachId;

    public Student(int id, int studentId, Date enrollDate, Date gradDate, float gpa, long coachId) {
        this.id = id;
        this.studentId = studentId;
        this.enrollDate = enrollDate;
        this.gradDate = gradDate;
        this.gpa = gpa;
        this.coachId = coachId;
    }

    public Student() {
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    public Date getGradDate() {
        return gradDate;
    }

    public void setGradDate(Date gradDate) {
        this.gradDate = gradDate;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public long getCoachId() {
        return coachId;
    }

    public void setCoachId(long coachId) {
        this.coachId = coachId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
