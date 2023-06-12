package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.pojo.HealthInfo;

public interface HealthInfoRepository extends JpaRepository<HealthInfo, Integer> {
	
//	//@Query("select h from HelthInfo h where h.")
//	 HealthInfo customerHealthInfo(int id) ;

}
