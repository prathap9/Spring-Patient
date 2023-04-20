package com.hdfc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdfc.entity.Queue;
@Repository
public interface IRepoQueue extends JpaRepository<Queue, Integer> {
	
//	public List<QueueAppointment>  getAllQueuewithAppointments();
	
	
	
	
	
	

}
