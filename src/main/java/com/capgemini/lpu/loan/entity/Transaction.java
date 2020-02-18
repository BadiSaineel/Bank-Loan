package com.capgemini.lpu.loan.entity;

import java.time.LocalDate;

public class Transaction {

	private String transAccountId;
	private String transType;
	private double transAmount;
	private String transOption;
	private LocalDate transDate;
	private String transChequeId;
	private String transFrom;
	private String transTo;
	private double transClosingBalance;
	
	public Transaction(String transAccountId, String transType, double transAmount, String transOption, LocalDate transDate,
			String transChequeId, String transFrom, String transTo, double transClosingBalance) {
		super();
		this.transAccountId = transAccountId;
		this.transType = transType;
		this.transAmount = transAmount;
		this.transOption = transOption;
		this.transDate = transDate;
		this.transChequeId = transChequeId;
		this.transFrom = transFrom;
		this.transTo = transTo;
		this.transClosingBalance = transClosingBalance;
	}
	public String getTransAccountId() {
		return transAccountId;
	}
	public String getTransType() {
		return transType;
	}
	public double getTransAmount() {
		return transAmount;
	}
	public String getTransOption() {
		return transOption;
	}
	public LocalDate getTransDate() {
		return transDate;
	}
	public String getTransChequeId() {
		return transChequeId;
	}
	public String getTransFrom() {
		return transFrom;
	}
	public String getTransTo() {
		return transTo;
	}
	public double getTransClosingBalance() {
		return transClosingBalance;
	}	
	
}
