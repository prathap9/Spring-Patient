package com.hdfc.doctor.service;

import java.util.List;

import com.hdfc.doctor.entity.Doctor;

public interface Iservice {

	public int addDoctor(Doctor doctor);
	
	public List<Doctor> getAllDoctors();
	
	public int updateDoctor(Doctor doctor);
	
	public int deleteDoctorById(int doctor);
	
	
}
