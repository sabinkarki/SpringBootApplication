package com.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController extends BaseController {
	
	@GetMapping(value="/")
	public String home(){
		return "Das boot, Reporting for the duty";
	}

}
