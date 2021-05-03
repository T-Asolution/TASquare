package com.tasolution.tasquare.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HeloController {

	@RequestMapping("/")
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("login");
		return mav;
	}
	
	@RequestMapping("/project")
	public ModelAndView project(ModelAndView mav) {
		mav.setViewName("project");
		return mav;
	}
}