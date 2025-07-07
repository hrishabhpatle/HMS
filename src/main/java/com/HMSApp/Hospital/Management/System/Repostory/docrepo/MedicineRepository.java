package com.HMSApp.Hospital.Management.System.Repostory.docrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HMSApp.Hospital.Management.System.DocEntity.Medicine;

public interface MedicineRepository extends JpaRepository<Medicine, Long> {
    // Custom query methods can be defined here if needed
    // For example, to find medicines by name:
    // List<Medicine> findByDurgname(String durgname);  

}
