package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HelloController {

	@GetMapping
	@RequestMapping("/")
	public String welcomefile() {
		return "index";
	}
	@GetMapping
	@RequestMapping("/hello")
	public String sayhello() {
		return "hello";
	}
	public ModelAndView getmessage() {
		String msg = "heloooo iet";
		return new ModelAndView("showmsg","message","msg");
		
	}

}
