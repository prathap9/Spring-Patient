package com.hdfc.appointment.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

@Entity

@Table(name = "reminder")

public class Reminder {

	@Id
	private int reminderID;
	private int appointmentID;
	private String reminderType; 
	private LocalDate reminderDate;
	
}
