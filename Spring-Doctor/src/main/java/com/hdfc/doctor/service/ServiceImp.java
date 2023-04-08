package com.hdfc.doctor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.doctor.entity.Doctor;
import com.hdfc.doctor.repository.IDoctorRepo;


@Service
public class ServiceImp implements Iservice{
	
	@Autowired
	IDoctorRepo repo;
	
	
@Override	
 public int addDoctor(Doctor doctor) {
		
		return repo.addDoctor(doctor);
		
	}

 @Override
 public List<Doctor> getAllDoctors(){
	 
	 return repo.getAllDoctors();
 }
 
 @Override
 public int updateDoctor(Doctor doctor) {
	 
	 return repo.updateDoctor(doctor);
 }
 
 @Override
 public int deleteDoctorById(int doctor) {
	 
	 return repo.deleteDoctorById(doctor);
 }

}
