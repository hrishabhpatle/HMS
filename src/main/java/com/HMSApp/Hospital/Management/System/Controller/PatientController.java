package com.HMSApp.Hospital.Management.System.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.HMSApp.Hospital.Management.System.Entity.Patient;
import com.HMSApp.Hospital.Management.System.Repostory.PatientRepository;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/patient")
public class PatientController {

    private PatientRepository patientRepository;
    public PatientController(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }
   
    @PostMapping("/addpatient")
    public Patient addPatient(@RequestBody Patient patient) {
        return patientRepository.save(patient);
    }
    @GetMapping
    public List<Patient>getAllPatient(){
        return patientRepository.findAll();
    }

}
