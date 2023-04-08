package com.hdfc.schedule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.hdfc.schedule.entity.Schedule;
import com.hdfc.schedule.service.IService;

@RestController
@RequestMapping("schedule")
public class ScheduleController {
	
	@Autowired 
	IService service;
	
	@PostMapping("/add")
	public String addSchedule(@RequestBody Schedule schedule) {

		String msg = null;

		int count = service.addSchedule(schedule);

		if (count > 0) {

			msg = count + " Record Inserted Successfully";

		} else {

			msg = "Insert fail..";
		}

		return msg;

	}
	
	@GetMapping(value = "/getall", produces = "application/json")
	public List<Schedule> getAll() { 

		List<Schedule> list = service.getallSchedule();

		return list;

	}
	
	@PutMapping(value = "/update", consumes = "application/json")
	public String updateSchedule(@RequestBody Schedule schedule) {

		String msg = null;

		int count = service.updateSchedule(schedule);

		if (count > 0) {

			msg = count + " Record Updated Successfully";

		} else {

			msg = "Update fail..";
		}

		return msg;

	}


}
