package com.cts.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyContoller {

	
	@RequestMapping("/hello")
	public String sayHello() {
		
		return "home";
	}
	
	@RequestMapping("/hi")
	public ModelAndView ragul() {
		
		ModelAndView mav=new ModelAndView();
		
		mav.setViewName("home");
		mav.addObject("name", "Ragul");
		
		return mav;
		
	}
}
