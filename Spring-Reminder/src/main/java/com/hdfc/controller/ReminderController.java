package com.hdfc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.entity.Reminder;
import com.hdfc.service.IReminder;
import com.hdfc.vo.ReminderAppointment;

@RestController
@RequestMapping("api/reminder")
public class ReminderController {
	
	@Autowired
	IReminder service2;
	
	@GetMapping("/getall")
	public List<Reminder> getAllReminder(){
		
		return service2.getAllReminder();
		
	}
	
@PutMapping("/update")
	
	public  Reminder  updateReminder(@RequestBody Reminder reminder) {
		
		return service2.updateReminder(reminder);
	}
@GetMapping("/get/{remId}")
public Reminder getReminderById(@PathVariable int remId) {
	
	return service2.getReminderById(remId);
}

@GetMapping("/get/remwithapp/{remId}")
public  ReminderAppointment	getremByIdWithapp(@PathVariable  int remId) {
	
	return service2.getReminderByIdWithAppointment(remId);
	
}


}
