package com.hcl.studentsphn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.studentsphn.dao.StudentDAO;
import com.hcl.studentsphn.model.Student;

@Service
public class StudentManagerImpl implements StudentManager{

	public void addEmployee(Student student) {
	StudentDAO.addStudent(student);
		
	}

}
