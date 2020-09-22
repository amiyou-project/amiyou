package edu.miu.team4.project.microserviceone.domain;

import am.i.student.domain.Student;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Coach extends Employee{
//    @OneToMany
//    //@JoinColumn(name="coach_id")
//    private List<Student> students = new ArrayList();
//
//    public List<Student> getStudents() {
//        return students;
//    }
//
//    public void setStudents(List<Student> students) {
//        this.students = students;
//    }
//    public boolean addStudent(Student student){
//        return(students.add(student));
//    }
}
