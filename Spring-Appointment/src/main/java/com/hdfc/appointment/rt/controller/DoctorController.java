package com.hdfc.appointment.rt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.hdfc.appointment.vo.Doctor;

@RestController
@RequestMapping("api/temp")
public class DoctorController {
	@Autowired
	RestTemplate resttemplate;
	
	String baseUrl = "http://localhost:8083/doctor";
	
	@GetMapping("/all")
	public List<Doctor> getAll(){
		List<Doctor> list = resttemplate.getForObject(baseUrl+"/getall",List.class);
		System.out.println(list);
		
		return list;
		
	}

}
