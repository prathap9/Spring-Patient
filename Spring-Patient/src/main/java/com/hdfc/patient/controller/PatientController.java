package com.hdfc.patient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.hdfc.patient.entity.Patient;
import com.hdfc.patient.service.IService;

@RestController
@RequestMapping("patient")

public class PatientController {
	
	@Autowired
	IService service;
	
	@PostMapping("/add")
	public String addPatient(@RequestBody Patient patient) {

		String msg = null;

		int count = service.addPatient(patient);

		if (count > 0) {

			msg = count + " Record Inserted Successfully";

		} else {

			msg = "Insert fail..";
		}

		return msg;

	}

}
