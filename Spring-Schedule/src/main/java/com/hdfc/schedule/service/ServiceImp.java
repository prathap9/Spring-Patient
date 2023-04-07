package com.hdfc.schedule.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.schedule.entity.Schedule;
import com.hdfc.schedule.repository.IScheduleRepo;
@Service
public class ServiceImp implements IService{
   @Autowired
   IScheduleRepo repo;
   
	public int addSchedule(Schedule schedule) {
		
		return repo.addSchedule(schedule);
		
	}
}
