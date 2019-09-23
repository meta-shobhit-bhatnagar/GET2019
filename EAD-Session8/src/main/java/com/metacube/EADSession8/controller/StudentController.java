package com.metacube.EADSession8.controller;

import java.util.ArrayList;
import java.util.List;

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

	// To get value from the yml file for notice at home page
	@Value("${home.notice}")
	private String schoolNotice;
	StudentData obj = new StudentData();
	int size = 0;



	/**
	 * redirects to home page
	 * 
	 * @param model
	 * @return home page address
	 */
	@GetMapping("/home")
	public String home(Model model) {
		System.out.println(schoolNotice);
		model.addAttribute("notice", schoolNotice);

		return "home";
	}

	/**
	 * redirects to signup form
	 * 
	 * @param model
	 * @return signup form page address
	 */
	@GetMapping("/signup")
	public String signup(Model model) {
		model.addAttribute("studentCommands", new StudentCommands());
		return "signup";
	}

	/**
	 * method to submit the form data
	 * 
	 * @param student
	 * @param result
	 * @return ModelAndView
	 */
	@PostMapping("/signup")
	public String doSignup(@Validated StudentCommands student, BindingResult result) {

		System.out.println(student.toString());

		if (result.hasErrors()) { // If field errors occur
			return "signup";
		} else {
			if (student.getEmail().equals("shobhit.bhatnagar@metacube.com")) {
				ObjectError objectError = new ObjectError("Email", "Email must be unique");
				result.addError(objectError);
				return "signup";
			} else {
				obj.getAllStudent(student, 1);
				

				return "redirect:/home";
			}
		}

	}

	/**
	 * redirects to showAll jsp page
	 * 
	 * @param model
	 * @return showAll page address
	 */
	@GetMapping("/showAll")
	public String showAllStudent(Model model) {
		
		try {
			model.addAttribute("list", obj.getAllStudent(null,size));
			size++;
		} catch (NullPointerException npe) {
			System.out.println("no more list items");
		}
		return "showAll";
	}

}
