package com.hdfc.service;

import java.util.List;

import com.hdfc.entity.Reminder;
import com.hdfc.vo.ReminderAppointment;

public interface IReminder {
	
//	public Reminder addReminder(ReminderDTO remainder);
	
	public List<Reminder> getAllReminder();
	
	public  Reminder  updateReminder(Reminder reminder);
	
	public Reminder getReminderById(int remId);
	
	public  ReminderAppointment		getReminderByIdWithAppointment(int remId);
	
	
	
	

}
