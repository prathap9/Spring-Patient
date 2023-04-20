package com.hdfc.appointment.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.hdfc.appointment.exception.AppointmentNotFoundException;



@RestControllerAdvice
public class GlobalExpController {
	
	@ExceptionHandler(AppointmentNotFoundException.class)
	public ResponseEntity<String> handleAppNotFoundExp(){
		
		
		return new ResponseEntity<String>("Appointment Not Found!",HttpStatus.BAD_REQUEST);
		
	}
	


}
