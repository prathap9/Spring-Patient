package com.hdfc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.entity.Queue;
import com.hdfc.service.IQueue;
import com.hdfc.vo.QueueReminder;

@RestController
@RequestMapping("api/queue")
public class QueueCotroller {
	@Autowired
	IQueue service2;
	
	@GetMapping("/getall")
	
	public List<Queue> getAllQueue(){
		
		return service2.getAllQueue();
	}
	
	@PutMapping("/update")
	
	public  Queue  updateQueue(@RequestBody Queue queue) {
		
		return service2.updateQueue(queue);
				
	}
	
	@GetMapping("/get/{queueId}")
	public Queue getQueueById(@PathVariable int queueId) {
		return service2.getQueueById(queueId);
		
	}
	
	
	  @GetMapping("/get/quewithrem/{queueId}") 
	  public  QueueReminder	getQueueByIdWithReminder(@PathVariable int queueId) {
	  
	  return service2.getQueueByIdWithReminder(queueId);
	  
	  }
	 
}
