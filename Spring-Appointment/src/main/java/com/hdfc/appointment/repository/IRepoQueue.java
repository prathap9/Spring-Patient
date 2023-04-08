package com.hdfc.appointment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hdfc.appointment.entity.Queue;
import com.hdfc.appointment.vo.QueueAppointment;

public interface IRepoQueue extends JpaRepository<Queue, Integer> {
	
	public List<QueueAppointment>  getAllQueuewithAppointments();
	
	
	
	
	
	

}
