package com.capgemini.lpu.Loan;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.capgemini.lpu.loan.exceptions.LoanRequestObjectException;
import com.capgemini.lpu.loan.exceptions.RequestIdException;
import com.capgemini.lpu.loan.exceptions.RequestIdFormateException;
import com.capgemini.lpu.loan.service.LoanService;
import com.capgemini.lpu.loan.service.LoanServiceImpl;

public class TestViewRequests {
	LoanService ser= new LoanServiceImpl();
	@Test
	@DisplayName("Functionality of checking null in view requests")
	public void test1() {
		assertThrows(LoanRequestObjectException.class,()-> ser.viewRequests(null));
	}
	
	@Test
	@DisplayName("Functionality of checking RequestIdFormateException in view requests")
	public void test2() {
		assertThrows(RequestIdFormateException.class,()-> ser.viewRequests("jjeh2832"));
	}
	
	@Test
	@DisplayName("Functionality of checking RequestIdException in view requests")
	public void test3() {
		assertThrows(RequestIdException.class,()-> ser.viewRequests("lid654589"));
	}
	
	@DisplayName("Functionality of view one request")
	@Test
	public void test4() throws RequestIdFormateException, RequestIdException, LoanRequestObjectException {
		assertNotNull(ser.viewRequests("lid756551"));
	}
	
	@Test
	@DisplayName("Functionality of view all requests")
	public void test5() {
		assertTrue(ser.viewRequests().size()>1);
	}
	
}
