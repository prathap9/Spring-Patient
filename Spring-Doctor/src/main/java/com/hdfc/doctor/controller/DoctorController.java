package com.hdfc.doctor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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

}
