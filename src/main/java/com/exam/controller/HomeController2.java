package com.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController2 {
	
	@GetMapping (value = "/")
	public ModelAndView home() {
		
		return new ModelAndView("index");
	}
	
}
