package com.hcl.studentsphn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.studentsphn.model.Student;
import com.hcl.studentsphn.service.StudentManager;

@Controller

public class StudentController {
	@RequestMapping(value="/getStudent",method=RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Student student=new Student();
		model.addObject("student", student);
		model.setViewName("addStudent");

		
	return model;

	}
	@Autowired
	StudentManager sMgr;
	@RequestMapping(value="/addStudent",method=RequestMethod.POST)
	public String addStudent(Student student,Model model) {
	return "StudentSuccess";

	}
	@RequestMapping(value="/updateStudent",method=RequestMethod.POST)
	public String updateStudent(Model model) {
	return "updateStudent";

	}
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String home(Model model) {
		{
model.addAttribute("student", new Student());
return "addStudent";

	}
	
	
	}
	
}
