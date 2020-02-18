package com.capgemini.lpu.loan.exceptions;

public class AmountException extends Exception{

	@Override
	public String toString() {
		return "Entered amount is not present in the given Account";
	}
    
}
