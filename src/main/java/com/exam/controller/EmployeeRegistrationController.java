package com.exam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping(value = "/employee_registration")
public class EmployeeRegistrationController {
	@GetMapping(value = "/add_emp_registration")
	public ModelAndView create() {
		System.out.println("employee:::::::::::::::");
		return new ModelAndView("/employee_registration");
	}
}