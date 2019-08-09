package com.hunter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyAppController {
	
	@RequestMapping(path="/")
	public String getHomePage () {
		return "home-page";
	}
	
	@RequestMapping(path="/showform")
	public String showForm() {
		return "myform";
	}
	
	@RequestMapping(path="/welcomeuser")
	public String welcomeUser() {
		return "welcome-user";
	}
	
	@RequestMapping(path="/mathtable")
	public String mathTable() {
		return "math-table";
	}
	
	
	
}
