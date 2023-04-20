package com.hdfc.patient.entity;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

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
	
	@NotNull
	@NotEmpty
    @Pattern(regexp = "^[a-zA-Z0-9]{3,12}$", message = "firstname must be of 3 to 12 length with no special characters")
	private String firstName;
	
	@NotNull
	@NotEmpty
    @Pattern(regexp = "^[a-zA-Z0-9]{3,12}$", message = "lastname must be of 3 to 12 length with no special characters")
	private String lastName;
	
	@NotNull
	private double contactDetails;
	
	@NotNull
	@NotEmpty
    @Pattern(regexp = "^[a-zA-Z0-9]{3,12}$", message = "medicalHistory must be of 3 to 12 length with no special characters")
	private String medicalHistory;
	
	@NotNull
	@NotEmpty
    @Pattern(regexp = "^[a-zA-Z0-9]{3,12}$", message = "insuranceDetails must be of 3 to 12 length with no special characters")
	private String insuranceDetails;

}

