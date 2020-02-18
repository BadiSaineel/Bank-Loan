package com.capgemini.lpu.loan.service;

import java.util.Map;

import com.capgemini.lpu.loan.entity.LoanRequest;
import com.capgemini.lpu.loan.exceptions.AccountIdException;
import com.capgemini.lpu.loan.exceptions.AccountIdFormateException;
import com.capgemini.lpu.loan.exceptions.LoanAmountException;
import com.capgemini.lpu.loan.exceptions.LoanRequestObjectException;
import com.capgemini.lpu.loan.exceptions.RequestIdException;
import com.capgemini.lpu.loan.exceptions.RequestIdFormateException;

public interface LoanService {

	String addLoanRequest(LoanRequest loanReqObj) throws AccountIdFormateException, LoanAmountException, LoanRequestObjectException;
	Map<String, LoanRequest> viewRequests();
	LoanRequest viewRequests(String reqid) throws RequestIdFormateException,RequestIdException, LoanRequestObjectException;
	String approveLoan(String reqid) throws RequestIdFormateException, RequestIdException, AccountIdException, LoanRequestObjectException;
	
}
