package com.HMSApp.Hospital.Management.System.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="age")
    private String age;
    @Column(name="bloodGroup")
    private String bloodGroup;
    @Column(name="prescription")
    private String prescription;
    @Column(name="dose")
    private String dose;
    @Column(name="fees")
    private String fees;
    private String urgency;
    
    public String getUrgency() {
        return urgency;
    }
    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getBloodGroup() {
        return bloodGroup;
    }
    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
    public String getPrescriptioin() {
        return prescription;
    }
    public void setPrescriptioin(String prescriptioin) {
        this.prescription = prescriptioin;
    }
    public String getDose() {
        return dose;
    }
    public void setDose(String dose) {
        this.dose = dose;
    }
    public String getFees() {
        return fees;
    }
    public void setFees(String fees) {
        this.fees = fees;
    }
    
    

}
