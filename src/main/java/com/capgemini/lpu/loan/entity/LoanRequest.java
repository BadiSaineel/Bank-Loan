package com.capgemini.lpu.loan.entity;

public class LoanRequest {

	private String loanRequestId;
	private String loanAccountId;
	private double loanAmount;
	private String loanType;
	private Integer loanTenure;
	private double loanRoi;
	private String loanStatus;
	private double loanEmi;
	private Integer creditScore;
	
	public LoanRequest(String loanRequestId, String loanAccountId, double loanAmount, String loanType,
			Integer loanTenure, double loanRoi, String loanStatus, double loanEmi, Integer creditScore) {
		super();
		this.loanRequestId = loanRequestId;
		this.loanAccountId = loanAccountId;
		this.loanAmount = loanAmount;
		this.loanType = loanType;
		this.loanTenure = loanTenure;
		this.loanRoi = loanRoi;
		this.loanStatus = loanStatus;
		this.loanEmi = loanEmi;
		this.creditScore = creditScore;
	}
	public String getLoanRequestId() {
		return loanRequestId;
	}
	public String getloanAccountId() {
		return loanAccountId;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public String getLoanType() {
		return loanType;
	}
	public Integer getLoanTenure() {
		return loanTenure;
	}
	public double getLoanRoi() {
		return loanRoi;
	}
	public String getLoanStatus() {
		return loanStatus;
	}
	public double getLoanEmi() {
		return loanEmi;
	}
	public Integer getCreditScore() {
		return creditScore;
	}
	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
	@Override
	public String toString() {
		return "Order ID : "+loanRequestId+" Loan Account ID : "+loanAccountId+" Loan Amount : "+loanAmount+" Loan Status : "+loanStatus;
	}
	
	
	
}
