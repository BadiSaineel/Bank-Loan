package com.capgemini.lpu.loan.dao;

import java.util.Map;

import com.capgemini.lpu.loan.entity.AccountManagement;
import com.capgemini.lpu.loan.entity.LoanRequest;
import com.capgemini.lpu.loan.entity.Transaction;
import com.capgemini.lpu.loan.exceptions.AccountIdException;
import com.capgemini.lpu.loan.exceptions.RequestIdException;
import com.capgemini.lpu.loan.repository.LoanRepository;

public class LoanDaoImpl implements LoanDao{

	public AccountManagement getAccount(String accid) throws AccountIdException {
		if(LoanRepository.accmap.containsKey(accid)) {
			return LoanRepository.accmap.get(accid);
		}
		else {
			throw new AccountIdException();
		}
	}

	public void daoAddLoanRequest(LoanRequest loanreq) {
		loanreq.setLoanStatus("REQUESTED & PROCESSING");
		LoanRepository.loanreqmap.put(loanreq.getLoanRequestId(), loanreq);
	}

	public Map<String, LoanRequest> daoViewRequests() {
		return LoanRepository.loanreqmap;
	}

	public boolean checkAccountId(String accid) {
		if(LoanRepository.accmap.containsKey(accid))
			return true;
		else
			return false;
	}

	public LoanRequest daoViewRequests(String reqid) throws RequestIdException{
		if(LoanRepository.loanreqmap.containsKey(reqid)) {
			return LoanRepository.loanreqmap.get(reqid);
		}
		else {
			throw new RequestIdException();
		}
	}

	public void daoApproveLoan(LoanRequest loanreq) {
		LoanRepository.loanreqmap.put(loanreq.getLoanRequestId(), loanreq);
	}

	public void updateAccountBalance(AccountManagement acc) {
		LoanRepository.accmap.put(acc.getAccountId(), acc);	
	}

	public void updateTransactions(Transaction txn) {
		LoanRepository.txnlist.add(txn);
		
	}

}
