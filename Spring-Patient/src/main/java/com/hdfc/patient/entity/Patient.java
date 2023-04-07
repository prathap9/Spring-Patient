package com.hdfc.patient.entity;

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
@Data
public class Patient {
	
	private int patientId;
	private String firstName;
	private String lastName;
	private double contactDetails;
	private String medicalHistory;
	private String insuranceDetails;

}
