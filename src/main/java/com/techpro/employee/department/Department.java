package com.techpro.employee.department;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String name;

    @Column
    private boolean status;

    @Column
    private Date createdDate;

    @Column
    private Date updatedDate;
}
