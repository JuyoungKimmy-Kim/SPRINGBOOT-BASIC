package com.mycom.myboard.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// @RestController아님. 비동기 요청에 대한 처리 controller가 아님--> 페이지 이동에 대한 역할 수행
@Controller
public class HomeController {
		
	@GetMapping(value="/")
	public String home() {
		return "/index.html";	 // static folder 의 index.html로 이동
	}
	
	@GetMapping("/login")
	public String login() {
		return "/login.html";
	}
	
	@GetMapping("/register")
	public String register() {
		return "/register.html";
	}
	
	@GetMapping("/board")
	public String board() {
		return "/board/boardMain.html";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "/login.html";
	}
}
