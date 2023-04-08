package com.hdfc.schedule.service;

import java.util.List;

import com.hdfc.schedule.entity.Schedule;

public interface IService {

	public int addSchedule(Schedule schedule);
	
	public List<Schedule> getallSchedule();
	
	public int updateSchedule(Schedule schedule);
}
