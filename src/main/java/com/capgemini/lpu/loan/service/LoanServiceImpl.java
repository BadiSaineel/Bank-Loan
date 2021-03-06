package com.capgemini.lpu.loan.service;

import java.time.LocalDate;
import java.util.Map;

import com.capgemini.lpu.loan.dao.LoanDao;
import com.capgemini.lpu.loan.dao.LoanDaoImpl;
import com.capgemini.lpu.loan.entity.AccountManagement;
import com.capgemini.lpu.loan.entity.LoanRequest;
import com.capgemini.lpu.loan.entity.Transaction;
import com.capgemini.lpu.loan.exceptions.AccountIdException;
import com.capgemini.lpu.loan.exceptions.AccountIdFormateException;
import com.capgemini.lpu.loan.exceptions.LoanAmountException;
import com.capgemini.lpu.loan.exceptions.LoanRequestObjectException;
import com.capgemini.lpu.loan.exceptions.RequestIdException;
import com.capgemini.lpu.loan.exceptions.RequestIdFormateException;

public class LoanServiceImpl implements LoanService{
	
	public static final int range=700;
	public static final double min=5000.0;
	public static final double max=1000000.0;

	LoanDao ld=new LoanDaoImpl();
	public String addLoanRequest(LoanRequest loanReqObj) throws AccountIdFormateException, LoanAmountException, LoanRequestObjectException, RequestIdFormateException {
		
		if(loanReqObj==null) {
			throw new LoanRequestObjectException();
		}
		
		if(!loanReqObj.getLoanRequestId().matches("[l][i][d][0-9]{6}"))
			throw new RequestIdFormateException();
		
		if(!loanReqObj.getloanAccountId().matches("[1-9][0-9]{11}"))
			throw new AccountIdFormateException();
		
		if((loanReqObj.getLoanAmount()<min) || (loanReqObj.getLoanAmount()>max)) {
			throw new LoanAmountException();
		}
		
		if(ld.checkAccountId(loanReqObj.getloanAccountId())) {
			ld.daoAddLoanRequest(loanReqObj);
			return "Successfully added Loan Request";
		}
		else
		return "LoanRequest Failed";
	}
	public Map<String, LoanRequest> viewRequests() {
		return ld.daoViewRequests();
	}
	public LoanRequest viewRequests(String reqid) throws RequestIdFormateException,RequestIdException, LoanRequestObjectException {
		if(reqid==null)
			throw new LoanRequestObjectException();
		if(!reqid.matches("[l][i][d][0-9]{6}"))
			throw new RequestIdFormateException();
		return ld.daoViewRequests(reqid);
	}
	public String approveLoan(String reqid) throws RequestIdFormateException, RequestIdException, AccountIdException, LoanRequestObjectException {
		
		LoanRequest req=viewRequests(reqid);
		if(!ld.checkAccountId(req.getloanAccountId()))
			throw new AccountIdException();
		if(req.getCreditScore()>range) {
			req.setLoanStatus("APPROVED");
			ld.daoApproveLoan(req);
			AccountManagement acc=ld.getAccount(req.getloanAccountId());
			acc.setAccountBalance(acc.getAccountBalance()+req.getLoanAmount());
			ld.updateAccountBalance(acc);
			Transaction txn1=new Transaction(acc.getAccountId(),"CREDIT",req.getLoanAmount(),"-",LocalDate.now(),"-","BANK",acc.getAccountId(),acc.getAccountBalance());
			ld.updateTransactions(txn1);
			return "APPROVED";
		}else {
			req=viewRequests(reqid);
			req.setLoanStatus("REJECTED");
			ld.daoApproveLoan(req);
			return "REJECTED";
		}
	}
	
	

	
	
}
