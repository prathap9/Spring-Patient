package com.hdfc.appointment.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdfc.appointment.entity.Appointment;

@Repository
public interface IRepoAppointment extends JpaRepository<Appointment,Integer >{

	
	
	
	

}


