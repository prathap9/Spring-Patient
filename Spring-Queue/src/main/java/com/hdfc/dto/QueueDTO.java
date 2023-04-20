package com.hdfc.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class QueueDTO {
	
	private int queueID;
	private int appointmentID;
	private int queueNumber;
	private String queueStatus;

}
