package edu.miu.team4.project.microserviceone.domain;

import am.i.student.domain.Student;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Coach extends Employee{
//    @OneToMany
//    @JoinColumn(name="coach_id")
//    private List<wrapperStudent> students = new ArrayList();

//    public List<Student> getStudents() {
//        return students;
//    }
//    public void setStudents(List<Student> students) {
//        this.students = students;
//    }
//    public boolean addStudent(Student student){
//        return(students.add(student));
//    }

}

// calling from stundetService -> findByCoachId --> List<wrapperStudent> wrapperClass
// 1 couach has many students ( owner
//    we eneed to push coach id on the student service entity/
// resttemplate exchange -