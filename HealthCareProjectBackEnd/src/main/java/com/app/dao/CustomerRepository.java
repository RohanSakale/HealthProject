package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojo.CustomerInfo;

public interface CustomerRepository extends JpaRepository<CustomerInfo, Integer> {
	
	
	
	

}
