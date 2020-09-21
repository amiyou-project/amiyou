package edu.miu.team4.project.microserviceone.domain;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Coach extends Employee{
    @OneToMany
    //@JoinColumn(name="coach_id")
    private List<Student> students = new ArrayList();

}
