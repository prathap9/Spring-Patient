package com.hdfc.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ReminderDTO {
	
	private int reminderID;
	private int appointmentID;
	private String reminderType; 
	private LocalDate reminderDate;
	

}
