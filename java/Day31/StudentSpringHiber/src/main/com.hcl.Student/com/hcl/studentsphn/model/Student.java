package com.hcl.studentsphn.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student {
	private int  Rollno;
	private String SName;
	private String Age;
	private String Gender;
	private String Country;
	private Date DateOfJoin;
	private float FinalScore;
	@Id
	@Column(name="Rollno")
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	@Column(name="Sname")
	public String getSName() {
		return SName;
	}
	public void setSName(String sName) {
		SName = sName;
	}
	@Column(name="Age")
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	@Column(name="Gender")
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	@Column(name="Country")
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	@Column(name="DateOfJoin")
	public Date getDateOfJoin() {
		return DateOfJoin;
	}
	public void setDateOfJoin(Date dateOfJoin) {
		DateOfJoin = dateOfJoin;
	}
	@Column(name="FinalScore")
	public float getFinalScore() {
		return FinalScore;
	}
	public void setFinalScore(float finalScore) {
		FinalScore = finalScore;
	}
	
	

}
