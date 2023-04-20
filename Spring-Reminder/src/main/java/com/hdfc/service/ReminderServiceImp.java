package com.hdfc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hdfc.entity.Reminder;
import com.hdfc.repository.IRepoReminder;
import com.hdfc.vo.Appointment;
import com.hdfc.vo.ReminderAppointment;
@Service
public class ReminderServiceImp implements IReminder {
	
	@Autowired
	IRepoReminder repo;
	
	@Autowired
	RestTemplate resttemplate;
	
 /* @Override
	public Reminder addReminder(ReminderDTO dto) {
		
		Reminder reminder = new Reminder();
		
		reminder.setReminderID(dto.getReminderID());
		reminder.setAppointmentID(dto.getAppointmentID());
		reminder.setReminderType(dto.getReminderType());
		reminder.setReminderDate(dto.getReminderDate());
		
		return repo.save(reminder);
	}   */

@Override
  public List<Reminder> getAllReminder(){
	
	return repo.findAll();
	
}

@Override
public  Reminder  updateReminder(Reminder reminder) {
	
	return repo.save(reminder);
	
}

@Override
public Reminder getReminderById(int remId) {
	
	return repo.findById(remId).orElse(null);
}

@Override
public  ReminderAppointment		getReminderByIdWithAppointment(int remId) { 

	
	Reminder reminder =	getReminderById(remId);
		
	int appId = reminder.getAppointmentID();
	
	
Appointment appointment =      resttemplate.getForObject("http://localhost:8084/api/appointment/get/"+appId, Appointment.class);


	ReminderAppointment RemApp = new ReminderAppointment(reminder,appointment);

	
	
	return RemApp;
	
}


}
