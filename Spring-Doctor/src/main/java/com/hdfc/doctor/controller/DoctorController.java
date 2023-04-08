package com.hdfc.doctor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.hdfc.doctor.entity.Doctor;
import com.hdfc.doctor.service.Iservice;


@RestController
@RequestMapping("doctor")
public class DoctorController {
	@Autowired
	Iservice service;

	@PostMapping("/add")
	public String addDoctor(@RequestBody Doctor doctor) {

		String msg = null;

		int count = service.addDoctor(doctor);

		if (count > 0) {

			msg = count + " Record Inserted Successfully";

		} else {

			msg = "Insert fail..";
		}

		return msg;

	}
	
	@GetMapping(value = "/getall", produces = "application/json")
	public List<Doctor> getAll() { 

		List<Doctor> list = service.getAllDoctors();

		return list;

	}
	
	@PutMapping(value = "/update", consumes = "application/json")
	public String updateDoctor(@RequestBody Doctor doctor) {

		String msg = null;

		int count = service.updateDoctor(doctor);

		if (count > 0) {

			msg = count + " Record Updated Successfully";

		} else {

			msg = "Update fail..";
		}

		return msg;

	}
	@DeleteMapping("/delete/{doctorId}")
	public ResponseEntity<String> deleteDoctorById(@PathVariable int doctorId) {

		int count = service.deleteDoctorById(doctorId);

		return new ResponseEntity<String>(count + " Record Deleted", HttpStatus.OK);

	}

}
