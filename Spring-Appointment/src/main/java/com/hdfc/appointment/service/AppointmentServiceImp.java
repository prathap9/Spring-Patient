package com.hdfc.appointment.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.appointment.dto.AppointmentDTO;
import com.hdfc.appointment.entity.Appointment;
import com.hdfc.appointment.repository.IRepoAppointment;

@Service
public class AppointmentServiceImp implements IAppointment {
	@Autowired
	IRepoAppointment repo;
	
	
	@Override
	public Appointment addAppointment(AppointmentDTO dto) {
		
		
		Appointment patient = new Appointment();
		
		patient.setAppointmentID(dto.getAppointmentID());
		patient.setPatientID(dto.getPatientID());
		patient.setDoctorID(dto.getDoctorID());
		patient.setAppointmentDate(dto.getAppointmentDate());
		patient.setAppointmentTime(dto.getAppointmentTime());
		patient.setStatus(dto.getStatus());
				
		return repo.save(patient);
			}
	@Override
	public  Appointment   updateAppointment(Appointment appointment) {
		
		return repo.save(appointment);
		
	}
	@Override
	public Appointment getAppointmentById(int appId) {
		
		return repo.findById(appId).orElse(null);
	}
	
	

}
