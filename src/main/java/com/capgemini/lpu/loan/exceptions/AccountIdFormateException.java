package com.capgemini.lpu.loan.exceptions;

public class AccountIdFormateException extends Exception{

	@Override
	public String toString() {
		
		return "Entered Account ID should contain atleast 12 numbers";
	}
	

}
