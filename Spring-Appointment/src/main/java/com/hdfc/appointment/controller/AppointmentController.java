package com.hdfc.appointment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.appointment.dto.AppointmentDTO;
import com.hdfc.appointment.entity.Appointment;
import com.hdfc.appointment.service.IAppointment;

@RestController
@RequestMapping("api/appointment")

public class AppointmentController {
	@Autowired
	IAppointment service;
	
	
	@PostMapping("/add")
	public Appointment  addAppointment(@RequestBody AppointmentDTO dto) {
		
		return service.addAppointment(dto);
		
	}

}
