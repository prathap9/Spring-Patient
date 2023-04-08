package com.hdfc.appointment.dto;

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
public class AppointmentDTO {
	
	private int appointmentID;
	private int patientID;
	private int  doctorID;
	private LocalDate  appointmentDate;
	private LocalDateTime appointmentTime;
	private String status;
	

}
