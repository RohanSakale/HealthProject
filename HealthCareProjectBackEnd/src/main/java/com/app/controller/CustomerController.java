package com.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Build;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.CustomerRepository;
import com.app.dto.Credentials;
import com.app.pojo.CustomerInfo;

@RestController
@RequestMapping("/api")
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepo;
	
	@PostMapping("/signUp")
	private CustomerInfo customerSignUp(@RequestBody CustomerInfo customerinfo) {
		System.out.println(customerinfo);
		return customerRepo.save(customerinfo);
		
	}
	


	 @GetMapping("/users/{id}")
	  public ResponseEntity<CustomerInfo> customerLogin(@PathVariable int id) {
		 System.out.println("User id="+id);
	        Optional<CustomerInfo> user = customerRepo.findById(id);
	        System.out.println("user="+user);
	        return  user.map(ResponseEntity::ok).orElseThrow(()-> new RuntimeException("user Not found."));
	   
	    }

}
