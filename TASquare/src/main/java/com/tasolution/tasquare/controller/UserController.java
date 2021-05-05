package com.tasolution.tasquare.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tasolution.tasquare.service.UserService;

@Controller
public class UserController {

	@Autowired
	HttpSession session;

	@Autowired
	UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginUser() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView findUser(HttpServletRequest request, ModelAndView mav) {
		String userId = request.getParameter("user_id");
		String password = request.getParameter("password");
		// ログイン処理
		mav = userService.Login(userId, password);
		return mav;
	}

}
