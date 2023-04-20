package com.hdfc.appointment.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.appointment.dto.AppointmentDTO;
import com.hdfc.appointment.entity.Appointment;
import com.hdfc.appointment.exception.AppointmentNotFoundException;
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
	
	@PutMapping("/update")
	public Appointment updateAppointmet(@RequestBody Appointment appointment ) {
		
		return service.updateAppointment(appointment);
		
	}
	
	@GetMapping("/get/{appId}")
    public Appointment getAppointmentById(@PathVariable int appId) throws AppointmentNotFoundException {
		
		System.out.println(appId);
		
		Appointment appointment = service.getAppointmentById(appId);
		
		if (appointment.getAppointmentID()==0) {
			
			throw new AppointmentNotFoundException();
		}
		
		return appointment;
	}

}



