package com.capgemini.lpu.loan.exceptions;
/**
 * 
 * @author : Sai Neel 
 * @Description : This is an exception class for account IDFormate.
 */
public class AccountIdFormateException extends Exception{

	@Override
	public String toString() {
		
		return "Entered Account ID should contain atleast 12 numbers";
	}
	

}
