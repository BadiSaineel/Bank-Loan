package com.capgemini.lpu.Loan;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.capgemini.lpu.loan.entity.LoanRequest;
import com.capgemini.lpu.loan.exceptions.AccountIdFormateException;
import com.capgemini.lpu.loan.exceptions.LoanAmountException;
import com.capgemini.lpu.loan.exceptions.LoanRequestObjectException;
import com.capgemini.lpu.loan.service.LoanService;
import com.capgemini.lpu.loan.service.LoanServiceImpl;

public class TestViewRequests {
	LoanService ser= new LoanServiceImpl();
	@Test
	public void test1() {
		assertThrows(LoanRequestObjectException.class,()-> ser.viewRequests(null));
	}
	
	@Test
	public void test2() {
		assertThrows(LoanRequestObjectException.class,()-> ser.viewRequests("jjeh2832"));
	}
}
