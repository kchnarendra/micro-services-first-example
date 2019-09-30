package com.narendra.microserviceone.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/one")
public class ControllerOne {

	@RequestMapping("/{sone}")
	public String getServiceOneData(@PathVariable("sone") String sone) {
		
		return "S_ONE  --  " + sone;
	}
}
