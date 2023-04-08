package com.hdfc.appointment.service;

import com.hdfc.appointment.dto.AppointmentDTO;
import com.hdfc.appointment.entity.Appointment;

public interface IAppointment {

	public Appointment  addAppointment(AppointmentDTO dto);
	
	
}
