package com.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.binding.StudentBinding;
import com.ashokit.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService ssv;
	
	@GetMapping("/loadform")
	public String loadForm(Model model) {
		
		model.addAttribute("gender", ssv.getGenderName());
		model.addAttribute("course", ssv.getCourses());
		model.addAttribute("timing", ssv.getTimingName());
		
		StudentBinding sobj=new StudentBinding();
		model.addAttribute("student", sobj);
		
		return "index";
	}
	
	@PostMapping("/savedata")
	public String handleRequest(StudentBinding sb,Model model) {
		
		System.out.println(sb);
        
		model.addAttribute("msg","reagister data sucessfully");
		
		return "dashboard";
	}
}
