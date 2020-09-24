package edu.miu.team4.project.microserviceone.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Coach{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
//    @Temporal(TemporalType.DATE)
    @Column(name="hiring_date")
    private Date hiringDate;
    @Column(name="room_office")
    private String roomOffice;
    @Column(name="responsability_desc")
    private String responsabilityDesc;

    @ElementCollection
    @CollectionTable(name="coach_Student")
    private List<Integer> studentid = new ArrayList();

    public List<Integer> getStudentid() {
        return studentid;
    }

//    public void setStudent_id(List<Integer> student_id) {
//        this.student_id = student_id;
//    }
    public boolean addStudent_id(Integer studentId){
        return studentid.add(studentId);
    }
}
