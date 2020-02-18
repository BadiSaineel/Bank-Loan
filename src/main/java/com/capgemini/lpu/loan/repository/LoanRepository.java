package com.capgemini.lpu.loan.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capgemini.lpu.loan.entity.AccountManagement;
import com.capgemini.lpu.loan.entity.Address;
import com.capgemini.lpu.loan.entity.Branch;
import com.capgemini.lpu.loan.entity.Customer;
import com.capgemini.lpu.loan.entity.LoanRequest;
import com.capgemini.lpu.loan.entity.Transaction;

public class LoanRepository {
	
	public static Map<String, AccountManagement> accmap=new HashMap<String, AccountManagement>();
	public static List<Transaction> txnlist=new ArrayList<Transaction>();
	public static Map<String, LoanRequest> loanreqmap=new HashMap<String, LoanRequest>();
	
	static{
		
		/**----BRANCH----------------------------------------------------------------------------------------------------------------------------------------------------------
        Branch(String  ,String   ,String     ,String)
        Branch(branchId,branchName,branchIFSC,branchAddress)*/
		
		Branch brnch1=new Branch("br1001","KONDAREDDY BURG","PCNA0001001","KURNOOL");
		Branch brnch2=new Branch("br1002","TEKKALI","PCNA0001002","SRIKAKULAM");
		Branch brnch3=new Branch("br1003","NARASARAO PET","PCNA0001003","GUNTUR");
		Branch brnch4=new Branch("br1004","MR PALLI","PCNA0001001","TIRUPATHI");
		
		
		/**----ADDRESS---------------------------------------------------------------------------------------------------------------------------------------------------------
        Address(String   ,String      ,String      ,String     ,String      ,String        ,String        ,Branch)
        Address(addressId,addressLine1,addressLine2,addressCity,addressState,addressCountry,addressZipcode,branch)*/
		
		Address add1=new Address("H No.12/9","2nd line","Amaravathi Nagar","KURNOOL","ANDHRA PRADESH","INDIA","523110",brnch1);
		Address add2=new Address("H No.14/6","3rd line","Amar Nagar","SRIKAKULAM","ANDHRA PRADESH","INDIA","523101",brnch2);
		Address add3=new Address("H No.356/5","1st line","Jyothi market","GUNTUR","ANDHRA PRADESH","INDIA","510110",brnch3);
		Address add4=new Address("H No.23/1","4th line","Maruthi Nagar","TIRUPATHI","ANDHRA PRADESH","INDIA","532008",brnch4);
		
		LocalDate d1=LocalDate.of(1997,5,26);
		LocalDate d2=LocalDate.of(1995,8,24);
		LocalDate d3=LocalDate.of(1999,11,12);
		LocalDate d4=LocalDate.of(1999,2,15);
		LocalDate d5=LocalDate.of(2020,1,12);
		LocalDate d6=LocalDate.of(2020,2,05);
		LocalDate d7=LocalDate.of(2019,12,23);
		
		
		/**----CUSTOMER--------------------------------------------------------------------------------------------------------------------------------------------------------
        Customer(String    ,String      ,Address        ,String        ,String      ,String          ,String         ,Date)
        Customer(customerId,customerName,customerAddress,customerAadhar,customaerPan,customaerContact,customaerGender,customaerDob)*/
		
		Customer cust1=new Customer("ct0001001", "Rao Ramesh", add1 , "121156982034", "XVGY258945", "9638521472" , "MALE" , d1);
		Customer cust2=new Customer("ct0001552", "Babu Suresh", add2 , "125153315555", "FBTN651513", "9513563153" , "MALE" , d2);
		Customer cust3=new Customer("ct0005133", "Amma Kumar", add3 , "121211112546", "KJJK321543", "8984653165" , "MALE" , d3);
		Customer cust4=new Customer("ct0008946", "Manasa Reddy", add4 , "115511552165", "RTHF655588", "9865316645" , "FEMALE" , d4);
		
		
		/**----ACCOUNT MANAGER-------------------------------------------------------------------------------------------------------------------------------------------------
        AccountManagement(String   ,Customer     ,String         ,String     ,String       ,double        ,double         ,Date) 
        AccountManagement(accountId,accountHolder,accountBranchId,accountType,accountStatus,accountBalance,accountInterest,lastUpdated)*/ 
		
		AccountManagement acc1=new AccountManagement("100000123456", cust1, "br1001", "SAVINGS", "ACTIVE", 200065.26, 0.0, d5);
		AccountManagement acc2=new AccountManagement("100000989565", cust2, "br1002", "CURRENT", "ACTIVE", 305067.86, 0.0, d6);
		AccountManagement acc3=new AccountManagement("100000248465", cust3, "br1003", "CURRENT", "ACTIVE", 500895.59, 0.0, d7);
		AccountManagement acc4=new AccountManagement("100000985456", cust4, "br1004", "SAVINGS", "ACTIVE", 850065.69, 0.0, d5);
		
		accmap.put(acc1.getAccountId(), acc1);
		accmap.put(acc2.getAccountId(), acc2);
		accmap.put(acc3.getAccountId(), acc3);
		accmap.put(acc4.getAccountId(), acc4);
		
		/**----TRANSACTION-----------------------------------------------------------------------------------------------------------------------------------------------------
        Transaction(String        ,String   ,double     ,String     ,Date     ,String       ,String   ,String ,double )
        Transaction(transAccountId,transType,transAmount,transOption,transDate,transChequeId,transFrom,transTo,transClosingBalance)*/
		
		Transaction tran1=new Transaction("100000123456","Credit",5515.0,"slip",d5,"-","Rao Ramesh","self",200065.26);
		Transaction tran2=new Transaction("100000989565","Debit",89515.0,"slip",d7,"-","Babu Suresh","self",305067.86);
		Transaction tran3=new Transaction("100000248465","Debiit",95615.0,"slip",d6,"-","Amma Kumar","self",500895.59);
		Transaction tran4=new Transaction("100000985456","Credit",12500.0,"slip",d6,"-","Manasa Reddy","self",850065.69);
		
		txnlist.add(tran1);
		txnlist.add(tran2);
		txnlist.add(tran3);
		txnlist.add(tran4);
		
		LoanRequest loanreq1=new LoanRequest("lid756551", "100000123456", 200000.0, "Property", 24, 2.5, "REQUESTED", 10000.0, 850);
		
		loanreqmap.put(loanreq1.getLoanRequestId(), loanreq1);
		
	}
}     
