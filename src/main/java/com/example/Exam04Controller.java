package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.UserForm;

@Controller
@RequestMapping("exam04")
public class Exam04Controller {
	@RequestMapping("")
	public String index() {
		return "exam04";
	}
	
	
	
	@ModelAttribute
	public UserForm setUpForm() {
		return new UserForm();
	}
	
	@RequestMapping("/result")
	public String result(@Validated UserForm userForm,BindingResult result,Model model) {
		if(result.hasErrors()) {
			return index();
		}else {
		model.addAttribute("name",userForm.getName());
		model.addAttribute("age",userForm.getAge());
		model.addAttribute("comment",userForm.getComment());
		
		return "exam04-result";
		
	}
	}

}
