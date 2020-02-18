package com.capgemini.lpu.loan.entity;

import java.util.Date;

public class LoanDisbursed {

	private String loanRequestId;
	private String loanCustomerId;
	private double loanAmount;
	private String loanType;
	private double loan_amount_paid;
	private Date loan_due_date;
	private double loanEmi;
	private Integer tenure;
	public LoanDisbursed(String loanRequestId, String loanCustomerId, double loanAmount, String loanType,
			double loan_amount_paid, Date loan_due_date, double loanEmi, Integer tenure) {
		super();
		this.loanRequestId = loanRequestId;
		this.loanCustomerId = loanCustomerId;
		this.loanAmount = loanAmount;
		this.loanType = loanType;
		this.loan_amount_paid = loan_amount_paid;
		this.loan_due_date = loan_due_date;
		this.loanEmi = loanEmi;
		this.tenure = tenure;
	}
	public String getLoanRequestId() {
		return loanRequestId;
	}
	public String getLoanCustomerId() {
		return loanCustomerId;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public String getLoanType() {
		return loanType;
	}
	public double getLoan_amount_paid() {
		return loan_amount_paid;
	}
	public Date getLoan_due_date() {
		return loan_due_date;
	}
	public double getLoanEmi() {
		return loanEmi;
	}
	public Integer getTenure() {
		return tenure;
	}
	
	
}
