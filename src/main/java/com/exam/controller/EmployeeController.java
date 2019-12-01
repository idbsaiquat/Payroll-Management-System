package com.exam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.exam.model.Employee;


@RestController
@RequestMapping(value = "/employee_registration")
public class EmployeeController {
	@GetMapping(value = "/add")
	public ModelAndView create() {
		System.out.println("employee:::::::::::::::");
		return new ModelAndView("/employee_registration");
	}
	@PostMapping(value = "/add-employee_registration")
	public Employee store(@RequestBody Employee entity) {
		//System.out.println(entity.getBasic_salary());
		System.out.println(entity.toString());
		return entity;
	}
}
