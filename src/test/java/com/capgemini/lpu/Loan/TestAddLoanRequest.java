package com.capgemini.lpu.Loan;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;

import com.capgemini.lpu.loan.entity.LoanRequest;
import com.capgemini.lpu.loan.exceptions.AccountIdFormateException;
import com.capgemini.lpu.loan.exceptions.LoanAmountException;
import com.capgemini.lpu.loan.exceptions.LoanRequestObjectException;
import com.capgemini.lpu.loan.exceptions.RequestIdFormateException;
import com.capgemini.lpu.loan.service.LoanService;
import com.capgemini.lpu.loan.service.LoanServiceImpl;

public class TestAddLoanRequest {
	LoanService ser= new LoanServiceImpl();
	@Test
	@DisplayName("Functionality of LoanRequestObjectException in add loan")
	public void test1(){
		LoanRequest req=null;
		assertThrows(LoanRequestObjectException.class,()-> ser.addLoanRequest(req));
	}
	
	@Test
	@DisplayName("Functionality of AccountIdFormateException in add loan")
	public void test2(){
		LoanRequest req=new LoanRequest("lid789568","89729898441",55000.0,"Land",16,2.5, "PROCESSING", 8545.5, 850);
		assertThrows(AccountIdFormateException.class,()-> ser.addLoanRequest(req));
	}
	
	@Test
	@DisplayName("Functionality of LoanAmountException in add loan")
	public void test3(){
		LoanRequest req1=new LoanRequest("lid158923","100000248465",550.0,"Land",16,2.5, "PROCESSING", 8545.5, 850);
		assertThrows(LoanAmountException.class,()-> ser.addLoanRequest(req1));
	}
	
	@Test
	@DisplayName("Functionality of checking loanreq failed in add loan")
	public void test4() throws AccountIdFormateException, LoanAmountException, LoanRequestObjectException, RequestIdFormateException{
		LoanRequest req2=new LoanRequest("lid897898","100000143365",5550.0,"Land",16,2.5, "PROCESSING", 8545.5, 850);
		assertEquals("LoanRequest Failed",ser.addLoanRequest(req2));
	}
	

	@Test
	@DisplayName("Functionality of successfull in add loan")
	public void test5() throws AccountIdFormateException, LoanAmountException, LoanRequestObjectException, RequestIdFormateException {
		LoanRequest req3=new LoanRequest("lid651589","100000248465",5550.0,"Land",16,2.5, "PROCESSING", 8545.5, 850);
		assertEquals("Successfully added Loan Request",ser.addLoanRequest(req3));
	}
	
	@Test
	@DisplayName("Functionality of RequestIdFormateException in add loan")
	public void test6(){
		LoanRequest req1=new LoanRequest("hhbhjc","100000248465",550.0,"Land",16,2.5, "PROCESSING", 8545.5, 850);
		assertThrows(RequestIdFormateException.class,()-> ser.addLoanRequest(req1));
	}

}
