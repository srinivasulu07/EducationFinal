package com.loan.education.model;

import com.loan.education.businesslogic.UserValidation;

public class Amount {
	public long amount;

	public long getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}	
	public void amountValidation() {
		UserValidation usr = new UserValidation();
		usr.validateAmount(amount);
	}
}

