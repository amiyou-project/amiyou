package edu.miu.team4.project.microserviceone.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class CptReport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Date date;
    @Column(length = 150)
    private String report;

}
