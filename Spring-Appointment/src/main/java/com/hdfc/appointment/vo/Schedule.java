package com.hdfc.appointment.vo;

import lombok.AllArgsConstructor;
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
