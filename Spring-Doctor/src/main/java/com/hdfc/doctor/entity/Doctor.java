package com.hdfc.doctor.entity;

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
public class Doctor {
	
	private int doctorId;
	private String  firstName;
	private String  lastName;
	private long contactDetails;
	private String specialization;

}
