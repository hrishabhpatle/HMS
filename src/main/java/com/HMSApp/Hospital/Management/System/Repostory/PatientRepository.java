package com.HMSApp.Hospital.Management.System.Repostory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HMSApp.Hospital.Management.System.Entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    
    // Custom query methods can be defined here if needed
    // For example, to find patients by name:
    // List<Patient> findByName(String name);

}
