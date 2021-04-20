package com.loan.education.model;

import com.loan.education.businesslogic.UserValidation;

public class Repaymentperiod {
	public int period;

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}
	public void periodValidation() {
		UserValidation usr = new UserValidation();
		usr.validatePeriod(period);
	}
}
