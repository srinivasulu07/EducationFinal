package com.loan.education.businesslogic;

import com.loan.education.view.EducationLoan;

public class UserValidation extends EducationLoan{
	static UserValidation user=new UserValidation();
	 
	public static int score = 0;

	public int validateEmployee(String userid, String password) {
		if (userid.equals("Srinivas")  && password.equals("Srinivas")) {
			
			return 1;
		}
		return 0;
	}

	public void validateAge(int age) {
		if (age >= 21 && age <= 35) {
			score++;
		}
	}
	public void validateAmount(long amount) {
		if (amount <= 700000) {
			score++;

		}
	}

	public void validateRank(int rank) {
		if (rank <= 200) {
			score++;
		}

	}

	public void validateCredit(int creditscore) {
		if (creditscore >= 700) {
			score++;
		}

	}

	public void validatePeriod(int period) {
		if (period <= 6) {
			score++;

		}
		System.out.println(score);
	}
	
		
	 
	public int  score() {
		// TODO Auto-generated method stub
		if (score>=3) {
			
			
			return 1;
		
		}
		else {

			return 0;
		}
	}
	public String status() {
		int s=user.score();
		if(s==1) {
			System.out.println("Based on your inputs You are eligible for eduaction loan and you will be notified for further process...");
			String stat="Yes";
			return stat;
			
		}else {
			System.out.println("You didn't meet the necessary criteria for education loan...");
			String stat="No";
			return stat;
		}
	}

	public int approve() {
		// TODO Auto-generated method stub
		//UserValidation user=new UserValidation();
		int s=user.score();
		if(s==1) {
			if(EducationLoan.amount<=600000) {
				int a=12;
				return a;
			}
			if(EducationLoan.amount>600000 && amount<=1000000) {
				int a=16;
				return a;
			}
			else if(EducationLoan.amount>1000000 && amount<200000){
				int a=20;
				return a;
			}
			else {
				return 0;
			}
		}
		return 0;
		
	}
	
}
