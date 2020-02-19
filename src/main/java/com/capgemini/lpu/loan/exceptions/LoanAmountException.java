package com.capgemini.lpu.loan.exceptions;
/**
 * 
 * @author : Sai Neel 
 * @Description : This is an exception class for Loan Amount.
 */
public class LoanAmountException extends Exception{

	@Override
	public String toString() {
		return "Loan Amount should be greater than 5000 and less than 1000000";
	}
	

}
