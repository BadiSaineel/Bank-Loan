package com.capgemini.lpu.loan.entity;
/**
 * 
 * @author : Sai Neel
 * @Description : This is an entity class which contains Branch details.
 */
public class Branch {

	private String branchId;
	private String branchName;
	private String branchIFSC;
	private String branchAddress;
	
	public Branch() {
		
	}
	
	public Branch(String branchId, String branchName, String branchIFSC, String branchAddress) {
		super();
		this.branchId = branchId;
		this.branchName = branchName;
		this.branchIFSC = branchIFSC;
		this.branchAddress = branchAddress;
	}


	public String getBranchId() {
		return branchId;
	}


	public String getBranchName() {
		return branchName;
	}


	public String getBranchIFSC() {
		return branchIFSC;
	}


	public String getBranchAddress() {
		return branchAddress;
	}
	
	
	
	
}
