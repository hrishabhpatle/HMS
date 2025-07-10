package com.HMSApp.Hospital.Management.System.Controller.docController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.HMSApp.Hospital.Management.System.DocEntity.Appointment;
import com.HMSApp.Hospital.Management.System.Repostory.docrepo.AppointmentRepository;

import java.util.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    private final AppointmentRepository appointmentRepository;

    public AppointmentController(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @PostMapping("/createappointment")
    public Appointment createAppointment(@RequestBody Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @GetMapping
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    @DeleteMapping("/deleteappointment/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteAppointment(@PathVariable Long id) {
        Appointment appointment = appointmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Appointment not found with id " + id));
        
        appointmentRepository.delete(appointment);

        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);

        return ResponseEntity.ok(response);
    }
}
