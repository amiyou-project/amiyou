package edu.miu.team4.project.microserviceone.domain;

import edu.miu.team4.project.microserviceone.DTO.Student;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Coach extends Employee{

    @ElementCollection
    @CollectionTable(name="coach_Student")
    private List<Integer> student_id = new ArrayList();

    public List<Integer> getStudent_id() {
        return student_id;
    }

//    public void setStudent_id(List<Integer> student_id) {
//        this.student_id = student_id;
//    }
    public boolean addStudent_id(Integer studentId){
        return student_id.add(studentId);
    }
}
