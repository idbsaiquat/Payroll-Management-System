package com.exam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping(value = "/index")
public class Homecontroller {
	@GetMapping(value = "/add_home")
	public ModelAndView create() {
		System.out.println("employee:::::::::::::::");
		return new ModelAndView("/index");
	}
}