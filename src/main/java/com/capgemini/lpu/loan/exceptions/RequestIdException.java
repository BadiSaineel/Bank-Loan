package com.capgemini.lpu.loan.exceptions;
/**
 * 
 * @author : Sai Neel 
 * @Description : This is an exception class for Request ID.
 */
public class RequestIdException extends Exception{

	@Override
	public String toString() {
		return "Request ID doesnot exsist";
	}
	

}
