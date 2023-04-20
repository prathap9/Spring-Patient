package com.hdfc.appointment.service;

import java.util.Optional;

import com.hdfc.appointment.dto.AppointmentDTO;
import com.hdfc.appointment.entity.Appointment;


public interface IAppointment {

	public Appointment  addAppointment(AppointmentDTO dto);
	
	public  Appointment   updateAppointment(Appointment appointment);
	
	public Appointment getAppointmentById(int appId);
	
	
	
	
	
	
	
	
	
}
