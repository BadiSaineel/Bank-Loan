package com.capgemini.lpu.loan.entity;

import java.time.LocalDate;

public class AccountManagement {

	private String accountId;
	private Customer accountHolder=new Customer();
	private String accountBranchId;
	private String accountType;
	private String accountStatus;
	private double accountBalance;
	private double accountInterest;
	private LocalDate lastUpdated;
	
	public AccountManagement(String accountId, Customer accountHolder, String accountBranchId, String accountType,
			String accountStatus, double accountBalance, double accountInterest, LocalDate lastUpdated) {
		super();
		this.accountId = accountId;
		this.accountHolder = accountHolder;
		this.accountBranchId = accountBranchId;
		this.accountType = accountType;
		this.accountStatus = accountStatus;
		this.accountBalance = accountBalance;
		this.accountInterest = accountInterest;
		this.lastUpdated = lastUpdated;
	}

	public String getAccountId() {
		return accountId;
	}

	public Customer getAccountHolder() {
		return accountHolder;
	}

	public String getAccountBranchId() {
		return accountBranchId;
	}

	public String getAccountType() {
		return accountType;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public double getAccountInterest() {
		return accountInterest;
	}

	public LocalDate getLastUpdated() {
		return lastUpdated;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	
}
