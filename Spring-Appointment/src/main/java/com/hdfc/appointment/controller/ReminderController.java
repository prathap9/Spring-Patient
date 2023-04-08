package com.hdfc.appointment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.appointment.entity.Reminder;
import com.hdfc.appointment.service.IReminder;

@RestController
@RequestMapping("api/remainder")
public class ReminderController {
	
	@Autowired
	IReminder service;
	
	@GetMapping("/getall")
	public List<Reminder> getAllReminder(){
		
		return service.getAllReminder();
		
	}

}
