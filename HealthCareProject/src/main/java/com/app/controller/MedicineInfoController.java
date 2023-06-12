package com.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.CustomerRepository;
import com.app.dao.MedicineInfoRepository;
import com.app.pojo.CustomerInfo;
import com.app.pojo.MedicineInfo;

@RestController
@RequestMapping("/api")
public class MedicineInfoController {
	
	@Autowired
	private MedicineInfoRepository medicineInfoRepo;
	
	
	 @GetMapping("/users/{id}/details")
	  public ResponseEntity<MedicineInfo> customerMedicineInfo(@PathVariable int id) {
		 System.out.println("Medicine id="+id);
	        Optional<MedicineInfo> medicinalInfo = medicineInfoRepo.findById(id);
	        System.out.println("Medicinal Info"+medicinalInfo);
	        return  medicinalInfo.map(ResponseEntity::ok).orElseThrow(()-> new RuntimeException("medicine Not found."));
	   
	    }

}
