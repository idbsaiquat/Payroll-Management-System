package com.exam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping(value = "/user")
public class Userlogincontroller {
	@GetMapping(value = "/add_user")
	public ModelAndView create() {
		System.out.println("employee:::::::::::::::");
		return new ModelAndView("/user");
	}
}