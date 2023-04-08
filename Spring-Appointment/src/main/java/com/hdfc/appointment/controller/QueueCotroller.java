package com.hdfc.appointment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.appointment.entity.Queue;
import com.hdfc.appointment.service.IQueue;

@RestController
@RequestMapping("api/queue")
public class QueueCotroller {
	@Autowired
	IQueue service;
	
	@GetMapping("/getall")
	
	public List<Queue> getAllQueue(){
		
		return service.getAllQueue();
	}

}
