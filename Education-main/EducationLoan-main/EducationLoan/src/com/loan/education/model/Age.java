package com.loan.education.model;

import com.loan.education.businesslogic.UserValidation;

public class Age {
	
	public int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void ageValidation() {
		UserValidation usr = new UserValidation();
		usr.validateAge(age);
	}

}
