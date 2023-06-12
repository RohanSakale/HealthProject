package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojo.MedicineInfo;

public interface MedicineInfoRepository extends JpaRepository<MedicineInfo, Integer> {

	
//	public interface MedicineRepository extends JpaRepository<MedicineInfo,Integer> {
//	    List<MedicineInfo> findHealthInfoById(int id);
//	}
}
