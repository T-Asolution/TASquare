package com.tasolution.tasquare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

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
	
	@RequestMapping("/ticketList")
	public ModelAndView ticketList(ModelAndView mav) {
		mav.setViewName("ticketList");
		return mav;
	}
}