package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.User;
import com.demo.service.LoginService;

@Controller
@RequestMapping("/security")
public class LoginController {
	
	public LoginController() {
		System.out.println("LoginController");
	}
	
	@Autowired
	private LoginService lservice;
	
	@GetMapping("/login")
	public String loginPage() {
		System.out.println("login");
		return "loginpage";
	}
	
	@PostMapping("/validate")
	public String validateData(@RequestParam("uname") String uname, @RequestParam String pwd){
		User user = lservice.validateUser(uname,pwd);
		if(user != null) {
			if(user.getRole().equals("admin")) {
				return "redirect:/product/showAll";
			}
		}else {
			return "loginpage";
		}
		return "loginpage";
		
			
	}

}
