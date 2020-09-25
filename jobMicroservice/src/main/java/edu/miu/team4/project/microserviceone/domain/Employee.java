package edu.miu.team4.project.microserviceone.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    @Column
    @Temporal(TemporalType.DATE)
    private Date hiringDate;
    @Column
    private String roomOffice;
    @Column
    private String responsabilityDesc;

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(Date hiringDate) {
        this.hiringDate = hiringDate;
    }

    public String getRoomOffice() {
        return roomOffice;
    }

    public void setRoomOffice(String roomOffice) {
        this.roomOffice = roomOffice;
    }

    public String getResponsabilityDesc() {
        return responsabilityDesc;
    }

    public void setResponsabilityDesc(String responsabilityDesc) {
        this.responsabilityDesc = responsabilityDesc;
    }
}
