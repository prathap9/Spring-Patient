package com.hdfc.patient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.patient.entity.Patient;
import com.hdfc.patient.repository.IRepo;

@Service
public class ServiceImp implements IService {
	
	@Autowired
	IRepo repo;

	public int addPatient(Patient patient) {
		
		return repo.addPatient(patient);
		
	}
}
