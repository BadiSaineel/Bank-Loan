package com.capgemini.lpu.loan.exceptions;
/**
 * 
 * @author : Sai Neel 
 * @Description : This is an exception class for account ID.
 */
public class AccountIdException extends Exception{

	@Override
	public String toString() {
		return "Account ID doesnot exsist";
	}
	

}
