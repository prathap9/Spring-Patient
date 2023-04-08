package com.hdfc.appointment.service;

import java.util.List;

import com.hdfc.appointment.dto.ReminderDTO;
import com.hdfc.appointment.entity.Reminder;

public interface IReminder {
	
//	public Reminder addReminder(ReminderDTO remainder);
	
	public List<Reminder> getAllReminder();
	

}
