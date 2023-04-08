package com.hdfc.appointment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hdfc.appointment.entity.Queue;
import com.hdfc.appointment.repository.IRepoQueue;
import com.hdfc.appointment.vo.Appointment;
import com.hdfc.appointment.vo.QueueAppointment;


@Service
public class QueueServiceImp implements IQueue {
	@Autowired
	IRepoQueue repo;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public List<Queue> getAllQueue(){
		return repo.findAll();
		
		
	}
	
	
	

}
