package com.hdfc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hdfc.vo.Reminder;

@RestController
@RequestMapping("api/temp")
public class RTController {
	
	@Autowired
	RestTemplate resttemplate;
	
	String baseUrl ="http://localhost:8085/api/reminder ";
	
	@GetMapping("/all")
	public List<Reminder> getAll(){
		List<Reminder> list = resttemplate.getForObject(baseUrl+"/getall",List.class);
		System.out.println(list);
		
		return list;
		
	}

}
