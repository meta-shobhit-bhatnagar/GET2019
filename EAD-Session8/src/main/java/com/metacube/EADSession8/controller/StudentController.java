package com.metacube.EADSession8.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.metacube.EADSession8.service.StudentData;
import com.metacube.EADSession8.model.commands.StudentCommands;

@Controller
public class StudentController {

	//To get value from the yml file for notice at home page
	@Value("${home.notice}")
	private String schoolNotice;
	
	@GetMapping("/home")
	public String home(Model model) {
		System.out.println(schoolNotice);
		model.addAttribute("notice", schoolNotice);
		
		return "home";
	}
	
	@GetMapping("/signup")
	public String signup(Model model) {
		model.addAttribute(new StudentCommands());
		return "signup";
	}
	
	@PostMapping("/signup")
	public String doSignup(@Validated StudentCommands student, BindingResult result) {
		
		System.out.println(student.toString());
		
		if(result.hasErrors()) { //If field errors occur
			return "signup";
		}else {
			if(student.getEmail().equals("shobhit.bhatnagar@metacube.com")) {
				ObjectError objectError = new ObjectError("Email","Email Must be unique");
				result.addError(objectError);
				return "signup";
			}else {
				return "redirect:/home";	
			}
		}
		
	}
	
	@GetMapping("/showAll")
	public String showAllStudent(Model model) {
		StudentData obj = new StudentData();
		model.addAttribute("list", obj.getAllStudent());
		return "showAll";
	}
	
	
}
