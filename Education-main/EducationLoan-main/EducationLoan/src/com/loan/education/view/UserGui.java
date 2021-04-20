package com.loan.education.view;

public class UserGui extends EducationLoan{

	public static void main(String[] args) {
		EducationLoan el = new EducationLoan();
		int result = el.employeValid();
		if(result == 1) {
			EducationLoan ed = new EducationLoan();
		
			System.out.println("Login Successfull");
			ed.mainMethod();
		}
		else {
			System.out.println("Invalid credentials..");
		}
	}
	
}
