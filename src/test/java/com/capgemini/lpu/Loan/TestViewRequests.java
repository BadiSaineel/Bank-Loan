package com.capgemini.lpu.Loan;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.capgemini.lpu.loan.entity.LoanRequest;
import com.capgemini.lpu.loan.exceptions.LoanRequestObjectException;
import com.capgemini.lpu.loan.exceptions.RequestIdException;
import com.capgemini.lpu.loan.exceptions.RequestIdFormateException;
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
		assertThrows(RequestIdFormateException.class,()-> ser.viewRequests("jjeh2832"));
	}
	
	@Test
	public void test3() {
		assertThrows(RequestIdException.class,()-> ser.viewRequests("lid654589"));
	}
	
	@Test
	public void test4() throws RequestIdFormateException, RequestIdException, LoanRequestObjectException {
		LoanRequest expected=new LoanRequest("lid756551", "100000123456", 200000.0, "Property", 24, 2.5, "REQUESTED", 10000.0, 850);
		assertEquals(expected.toString(),ser.viewRequests("lid756551").toString());
	}
	
	@Test
	public void test5() {
		Map<String,LoanRequest> expected=new HashMap<>();
		LoanRequest req1=new LoanRequest("lid756551", "100000123456", 200000.0, "Property", 24, 2.5, "REQUESTED", 10000.0, 850);
		expected.put(req1.getLoanRequestId(), req1);
		assertEquals(expected.toString(),ser.viewRequests().toString());
	}
	
}
