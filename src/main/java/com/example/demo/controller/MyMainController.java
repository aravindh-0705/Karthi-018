package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyMainController {
	
	@RequestMapping("/")
	public ModelAndView indexView()
	{
		ModelAndView mv = new ModelAndView("index");
		
		return mv;
	}

}
