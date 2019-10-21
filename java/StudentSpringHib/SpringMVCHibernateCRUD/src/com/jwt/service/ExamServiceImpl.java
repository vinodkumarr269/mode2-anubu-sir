package com.jwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.ExamDAO;
import com.jwt.model.Exam;
@Service
@Transactional
public class ExamServiceImpl implements ExamService{
	
	@Autowired
	private ExamDAO examDAO;

	@Transactional
	public void addExam(Exam exam) {
		examDAO.addExam(exam);
		
	}

}
