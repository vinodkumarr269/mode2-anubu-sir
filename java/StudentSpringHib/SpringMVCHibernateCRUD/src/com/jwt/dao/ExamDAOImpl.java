package com.jwt.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.Exam;
@Repository
public class ExamDAOImpl implements ExamDAO{

	@Autowired
	private SessionFactory sessionFactory;

	
	public void addExam(Exam exam) {
		
		sessionFactory.getCurrentSession().save(exam);
	
	}

}
