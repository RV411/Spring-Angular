package com.RV411.employeemanager.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Employee implements Serializable {
    @Id
    private Long id;
    private String name;
    private String jobTitle;
    private String phone;
    private String imageUrl;
    private String employeeCode;
}
