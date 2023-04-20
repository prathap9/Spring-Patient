package com.hdfc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hdfc.entity.Queue;
import com.hdfc.repository.IRepoQueue;
import com.hdfc.vo.QueueReminder;
import com.hdfc.vo.Reminder;


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
	
	@Override
	public Queue updateQueue(Queue queue) {
		return repo.save(queue);
			}
	
	@Override
	 public Queue getQueueById(int queueId) {
		return repo.findById(queueId).orElse(null);
		
	}
	
	
	@Override
	public  QueueReminder	getQueueByIdWithReminder(int queueId) {
		
		Queue queue =	getQueueById(queueId);
		
		int remId = queue.getAppointmentID();
		
		
	Reminder reminder =      restTemplate.getForObject("http://localhost:8085/api/remainder/get/"+remId, Reminder.class);


		QueueReminder queRem = new QueueReminder(queue,reminder);
		
		return queRem;
		
	}
	
	

}
