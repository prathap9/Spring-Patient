package com.hdfc.schedule.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.schedule.entity.Schedule;
import com.hdfc.schedule.repository.IScheduleRepo;
@Service
public class ServiceImp implements IService{
   @Autowired
   IScheduleRepo repo;
 
   @Override
	public int addSchedule(Schedule schedule) {
		
		return repo.addSchedule(schedule);
				
	}
   @Override
   public List<Schedule> getallSchedule(){
	   
	   return repo.getallSchedule();
   }
   @Override
   public int updateSchedule(Schedule schedule) {
	   
	   return repo.updateSchedule(schedule);
   }
}
