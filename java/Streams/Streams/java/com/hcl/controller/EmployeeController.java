package com.hcl.controller;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.model.Employee;
import com.hcl.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@RequestMapping(value ="/")
	public ModelAndView listStudent(ModelAndView model) throws IOException {
		List<Employee> listemployee = employeeService.getAllEmployees();
		model.addObject("searchEmployee",new Employee());
	//	   model.addObject("searchEmployeeband",new Employee());
		model.addObject("listemployee", listemployee);
		model.setViewName("home");
		return model;
	}
	@RequestMapping(value ="searchEmployee")
	public ModelAndView searchEmployee(ModelAndView model, @ModelAttribute Employee searchEmployee) throws IOException {
		        List<Employee> listEmployee =  employeeService.getAllEmployees();
		        listEmployee = listEmployee.stream().filter((var) -> ( searchEmployee.getSalary()==0.0 || var.getSalary() >searchEmployee.getSalary()) && (searchEmployee.getBand()=='0'|| var.getBand()==searchEmployee.getBand()) && var.getEmpName().startsWith(searchEmployee.getEmpName())).collect(Collectors.toList()); 
		        model.addObject("listemployee", listEmployee);
		        model.addObject("searchEmployee", searchEmployee );
		    //    model.addObject("searchEmployeeband",new Employee());
		        model.setViewName("home");
		       System.out.println(listEmployee.size());
		       return model;
		}

}