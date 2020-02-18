package com.capgemini.lpu.loan.dao;

import java.util.Map;

import com.capgemini.lpu.loan.entity.AccountManagement;
import com.capgemini.lpu.loan.entity.LoanRequest;
import com.capgemini.lpu.loan.entity.Transaction;
import com.capgemini.lpu.loan.exceptions.AccountIdException;
import com.capgemini.lpu.loan.exceptions.RequestIdException;

public interface LoanDao {
	
	public AccountManagement getAccount(String accid) throws AccountIdException;
	public boolean checkAccountId(String accid);
	public void daoAddLoanRequest(LoanRequest loanreq);
	public Map<String, LoanRequest> daoViewRequests();
	public LoanRequest daoViewRequests(String reqid) throws RequestIdException;
	public void daoApproveLoan(LoanRequest loanreq);
	public void updateAccountBalance(AccountManagement acc);
	public void updateTransactions(Transaction txn);

}
