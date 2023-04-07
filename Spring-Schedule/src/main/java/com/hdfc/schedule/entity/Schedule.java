package com.hdfc.schedule.entity;



import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Schedule {
	
	private int scheduleId;
	private int doctorId;
	private String dayOfWeek;
	private String timeSlot;
	private String availability;
	
	
	
	
}
