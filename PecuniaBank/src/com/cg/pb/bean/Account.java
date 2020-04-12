package com.cg.pb.bean;

import java.util.ArrayList;

public class Account {
	String accId;
	int branchId;
	String type;
	double balance;
	Customer customer;
	Address address;
	long accNo;
	static ArrayList<Account> allAccounts = new ArrayList<>();

	public void saveAccount(Account account){
		allAccounts.add(account);
	}
	public Account getAccountDetails(long accNo){
		int id=-1;
		for(int i=0; i<allAccounts.size();i++){
			if(allAccounts.get(i).getAccNo() == accNo) {
				id = i;
				break;
			}
		}
		if(id==-1)
		{
			System.out.println("No Account Found Or Invalid Account");
		}
		else {
			Account a = (Account) allAccounts.get(id);
			return a;
		}
		return null;
	}
	public String getAccId() {
		return accId;
	}

	public void setAccId(String accId) {
		this.accId = accId;
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}



	@Override
	public String toString() {
		return "Account [accId=" + accId + ", branchId=" + branchId + ", type=" + type + ", balance=" + balance
				+ ", \ncustomer=" + customer + ", \naddress=" + address + ", \naccNo=" + accNo + "]";



	}

}
