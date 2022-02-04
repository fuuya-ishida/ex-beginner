package com.example;


import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("exam03")
public class Exam03Controller {
	@RequestMapping("")
	public String index() {
		return "exam03";
	}
	
	@Autowired
	private ServletContext application;
	@RequestMapping("/result")
	public String result(Integer item1,Integer item2,Integer item3) {
		
		application.setAttribute("itemsub", String.format("%,d",item1 + item2 + item3));
		
		
		Integer itemintax = (int)((item1 + item2 + item3)* 1.1);
		

		application.setAttribute("itemintax", String.format("%,d",itemintax));
		
		return "exam03-result";
	}
	
	
	

}
