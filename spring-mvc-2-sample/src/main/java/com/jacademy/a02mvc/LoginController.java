package com.jacademy.a02mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jacademy.a02mvc.model.Login;

@Controller
@RequestMapping("/login")
public class LoginController {

	@RequestMapping(method=RequestMethod.GET)
	public String loginForm(){
		return "login/login_form";
	}
	
	@RequestMapping(params="action=login")
	public String check(Login login, HttpServletRequest request){
		
		if (login.getId().equals("admin")) {
			if (login.getPw().equals("1234")) {
				//로그인처리: 세션을 얻어와 userId라는 키로 아이디를 저장한다.
				request.getSession().setAttribute("userId", "admin");
			}
		}
		return "login/login_form";
	}
	
	@RequestMapping(params="action=logout")
	public String logout(HttpServletRequest request){
		//세션 저장정보 파괴
		request.getSession().invalidate();
		
		return "login/login_form";
	}
}
