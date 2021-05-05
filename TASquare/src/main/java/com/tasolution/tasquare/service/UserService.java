package com.tasolution.tasquare.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.tasolution.tasquare.model.dao.UserInfoRepository;
import com.tasolution.tasquare.model.entity.UserInfo;

@Service
public class UserService {

	@Autowired
	HttpSession session;

	@Autowired
	UserInfoRepository userInfoRepository;

	public ModelAndView Login(String userId, String password) {
		ModelAndView mav = new ModelAndView();
		UserInfo loginUser = userInfoRepository.findByUserIdAndPassword(userId, password);
		if (loginUser != null) {
			session.setAttribute("login_user", loginUser);
			mav.setViewName("redirect:project");
		} else {
			mav.addObject("errormsg", "ユーザID、パスワードの入力に誤りがあるか登録されていません。");
			mav.setViewName("login");
		}
		return mav;
	}
}
