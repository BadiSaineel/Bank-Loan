package com.capgemini.lpu.loan.entity;

import java.time.LocalDate;
/**
 * 
 * @author : Sai Neel
 * @Description : This is an entity class which contains customer details and Address object.
 */
public class Customer {
	private String customerId;
	private String customerName;
	private Address customerAddress=new Address();
	private String customerAadhar;
	private String customerPan;
	private String customerContact;
	private String customerGender;
	private LocalDate customerDob;
	
	public Customer() {
		
	}
	
	public Customer(String customerId, String customerName, Address customerAddress, String customerAadhar,
			String customerPan, String customerContact, String customerGender,LocalDate customerDob) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerAadhar = customerAadhar;
		this.customerPan = customerPan;
		this.customerContact = customerContact;
		this.customerGender = customerGender;
		this.customerDob = customerDob;
	}
	
	public String getCustomerId() {
		return customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public String getCustomerAadhar() {
		return customerAadhar;
	}
	public String getCustomerPan() {
		return customerPan;
	}
	public String getCustomerContact() {
		return customerContact;
	}
	public String getCustomerGender() {
		return customerGender;
	}
	public LocalDate getCustomerDob() {
		return customerDob;
	}
	
	
}
