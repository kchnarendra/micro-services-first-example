package com.narendra.microservicethree.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/three")
public class ControllerThree {

	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/{sthree}")
	public String getServiceThreeData(@PathVariable("sthree") String sthree) {
		
		String strOne = restTemplate.getForObject("http://micro-service-one/one/1", String.class);
		String strTwo = restTemplate.getForObject("http://micro-service-two/two/2", String.class);
		
		return "S_THREE  --  " + sthree + "    ****   " + strOne + "   ****   " + strTwo;
	}
}
