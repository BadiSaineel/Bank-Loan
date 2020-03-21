package com.capgemini.lpu.loan.exceptions;
/**
 * 
 * @author : Sai Neel 
 * @Description : This is an exception class for account IDFormate.
 */
public class AccountIdFormateException extends Exception{

	@Override
	public String toString() {
		
		return "Entered Account ID must be 12 digit number";
	}
	

}
