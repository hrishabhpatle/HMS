package com.HMSApp.Hospital.Management.System.Repostory.docrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HMSApp.Hospital.Management.System.DocEntity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    // Custom query methods can be defined here if needed
    // For example, to find appointments by patient name or date
    // List<Appointment> findByPatientName(String patientName);
    // List<Appointment> findByDate(LocalDate date);

}
