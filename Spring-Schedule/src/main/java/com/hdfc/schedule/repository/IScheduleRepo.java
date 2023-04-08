package com.hdfc.schedule.repository;

import java.util.List;

import com.hdfc.schedule.entity.Schedule;

public interface IScheduleRepo {

	public int addSchedule(Schedule schedule);
	
    public List<Schedule> getallSchedule();
	
	public int updateSchedule(Schedule schedule);
}
