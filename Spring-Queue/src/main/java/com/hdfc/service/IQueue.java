package com.hdfc.service;

import java.util.List;

import com.hdfc.entity.Queue;
import com.hdfc.vo.QueueReminder;

public interface IQueue {
	
	public List<Queue> getAllQueue();
	
	public Queue updateQueue(Queue queue);
	
    public Queue getQueueById(int queueId);
	
	public  QueueReminder	getQueueByIdWithReminder(int queueId);

	
}
