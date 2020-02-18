package com.capgemini.lpu.loan.ui;

import com.capgemini.lpu.loan.entity.LoanRequest;
import com.capgemini.lpu.loan.exceptions.AccountIdFormateException;
import com.capgemini.lpu.loan.exceptions.LoanAmountException;
import com.capgemini.lpu.loan.exceptions.LoanRequestObjectException;
import com.capgemini.lpu.loan.service.LoanService;
import com.capgemini.lpu.loan.service.LoanServiceImpl;

public class LoanUI {

	public static void main(String[] args) {
	
		LoanService ser=new LoanServiceImpl();
		try {
			ser.addLoanRequest(null);
		} catch (AccountIdFormateException e) {
			e.printStackTrace();
		} catch (LoanAmountException e) {
			e.printStackTrace();
		} catch (LoanRequestObjectException e) {
			e.printStackTrace();
		}
	}
}
