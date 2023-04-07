package com.hdfc.doctor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.doctor.entity.Doctor;
import com.hdfc.doctor.repository.IDoctorRepo;


@Service
public class ServiceImp implements Iservice{
	
	@Autowired
	IDoctorRepo repo;
	
 public int addDoctor(Doctor doctor) {
		
		return repo.addDoctor(doctor);
		
	}

}
