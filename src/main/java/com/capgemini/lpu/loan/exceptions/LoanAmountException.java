package com.capgemini.lpu.loan.exceptions;

public class LoanAmountException extends Exception{

	@Override
	public String toString() {
		return "Loan Amount should be greater than 5000 and less than 1000000";
	}
	

}
