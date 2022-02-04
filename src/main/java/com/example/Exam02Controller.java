package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("exam02")
public class Exam02Controller {
	@RequestMapping("")
	public String index() {
		return "exam02";
	}

}
