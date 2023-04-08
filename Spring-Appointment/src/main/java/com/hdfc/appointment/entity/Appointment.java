package com.hdfc.appointment.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

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
@Table(name="appointment")
public class Appointment {
	
@Id
	private int appointmentID;
	private int patientID;
	private int  doctorID;
	private LocalDate  appointmentDate;
	private LocalDateTime appointmentTime;
	private String status;
	
}
