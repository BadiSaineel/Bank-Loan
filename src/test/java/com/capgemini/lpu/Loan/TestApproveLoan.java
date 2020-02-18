package com.capgemini.lpu.Loan;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.capgemini.lpu.loan.exceptions.AccountIdException;
import com.capgemini.lpu.loan.exceptions.LoanRequestObjectException;
import com.capgemini.lpu.loan.exceptions.RequestIdException;
import com.capgemini.lpu.loan.exceptions.RequestIdFormateException;
import com.capgemini.lpu.loan.service.LoanService;
import com.capgemini.lpu.loan.service.LoanServiceImpl;

public class TestApproveLoan {

	LoanService ser= new LoanServiceImpl();
	
	@Test
	public void test1() throws RequestIdFormateException, RequestIdException, AccountIdException, LoanRequestObjectException {
		assertThrows(LoanRequestObjectException.class,()->ser.approveLoan(null));
	}
	
	@Test
	public void test2() {
		assertThrows(RequestIdFormateException.class,()-> ser.approveLoan("jjeh2832"));
	}
	
	@Test
	public void test3() {
		assertThrows(RequestIdException.class,()-> ser.approveLoan("lid515688"));
	}
	
	@Test
	public void test4() {
		assertThrows(AccountIdException.class,()-> ser.approveLoan("lid756553"));
	}
	
	@Test
	public void test5() throws RequestIdFormateException, RequestIdException, AccountIdException, LoanRequestObjectException {
		assertEquals("APPROVED",ser.approveLoan("lid756551"));
	}
	
	@Test
	public void test6() throws RequestIdFormateException, RequestIdException, AccountIdException, LoanRequestObjectException {
		assertEquals("REJECTED",ser.approveLoan("lid756554"));
	}
	

}
