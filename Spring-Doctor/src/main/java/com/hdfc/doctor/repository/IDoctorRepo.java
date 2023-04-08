package com.hdfc.doctor.repository;



import java.util.List;

import com.hdfc.doctor.entity.Doctor;

public interface IDoctorRepo {

	public int addDoctor(Doctor doctor);
	
	public List<Doctor> getAllDoctors();
	
	public int updateDoctor(Doctor doctor);
	
	public int deleteDoctorById(int doctor);
	
}
