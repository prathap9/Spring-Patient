package com.hdfc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdfc.entity.Reminder;
@Repository
public interface IRepoReminder extends JpaRepository<Reminder, Integer> {
	
	
	
	
}
