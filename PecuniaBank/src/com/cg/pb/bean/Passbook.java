package com.cg.pb.bean;

//public class Passbook {
//	long accNo;
//	int startDate;
//	int endDate;
//	public long getAccNo() {
//		return accNo;
//	}
//	public void setAccNo(long accNo) {
//		this.accNo = accNo;
//	}
//	public long getStartDate() {
//		return startDate;
//	}
//	public void setStartDate(int startDate) {
//		this.startDate = startDate;
//	}
//	public long getEndDate() {
//		return endDate;
//	}
//	public void setEndDate(int endDate) {
//		this.endDate = endDate;
//	}
//	public String getPassBook() {
//		return "PassBook Printed";
//	}
//}


import java.util.ArrayList;

public class Passbook {
	private long accNo;
	private double amount;
	private double balance;
	private String type;
	public static ArrayList<Passbook> list = new ArrayList<>() ;
	public Passbook(long accNo, double amount, double balance,String type) {
		this.accNo = accNo;
		this.amount = amount;
		this.balance = balance;
		this.type = type;
		list.add(this);

	}

	public static void getAllTransactions(long actNO) {
		boolean check = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAccNo() == actNO) {
				System.out.println(list.get(i).getPassBook());
				break;
			}
			if(check){System.out.println("Invalid Account / No Transaction Found");}
		}
	}
	public double getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public String getPassBook() {
		return "PassBook [accNo=" + accNo
				+ ", amount=" + amount + ", balance=" + balance + ",Transaction-Type = "+type+"]";
	}

}