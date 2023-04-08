package com.hdfc.appointment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.appointment.dto.ReminderDTO;
import com.hdfc.appointment.entity.Reminder;
import com.hdfc.appointment.repository.IRepoReminder;
@Service
public class ReminderServiceImp implements IReminder {
	
	@Autowired
	IRepoReminder repo;
	
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

}
