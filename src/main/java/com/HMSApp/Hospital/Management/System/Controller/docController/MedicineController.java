package com.HMSApp.Hospital.Management.System.Controller.docController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HMSApp.Hospital.Management.System.DocEntity.Medicine;
import com.HMSApp.Hospital.Management.System.Repostory.docrepo.MedicineRepository;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/medicine")
public class MedicineController {
    private MedicineRepository medicineRepository;
    public MedicineController(MedicineRepository medicineRepository) {
        this.medicineRepository = medicineRepository;
    }
    @PostMapping("/addmedicine")
    public Medicine addMedicine( @RequestBody Medicine medicine) {
        return medicineRepository.save(medicine);
    }  
    @GetMapping("/getmedicine")
    public List<Medicine> getAllMedicine() {
        return medicineRepository.findAll();
    }
   

}
