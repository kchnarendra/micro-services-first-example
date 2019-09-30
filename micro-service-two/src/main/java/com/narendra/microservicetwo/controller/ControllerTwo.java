package com.narendra.microservicetwo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/two")
public class ControllerTwo {

	@RequestMapping("/{stwo}")
	public String getServiceTwoData(@PathVariable("stwo") String stwo) {
		
		return "S_TWO  --  " + stwo;
	}
}