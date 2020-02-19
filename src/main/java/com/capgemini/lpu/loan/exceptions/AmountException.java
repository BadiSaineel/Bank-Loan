package com.capgemini.lpu.loan.exceptions;
/**
 * 
 * @author : Sai Neel 
 * @Description : This is an exception class for Amount.
 */
public class AmountException extends Exception{

	@Override
	public String toString() {
		return "Entered amount is not present in the given Account";
	}
    
}
