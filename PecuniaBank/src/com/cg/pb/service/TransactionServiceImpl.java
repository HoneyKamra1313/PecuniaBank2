package com.cg.pb.service;

import com.cg.pb.bean.Account;
import com.cg.pb.bean.Passbook;
import com.cg.pb.bean.Transaction;
import com.cg.pb.dao.TransactionDAOImpl;

public class TransactionServiceImpl implements TransactionService{
	
	TransactionDAOImpl dao = new TransactionDAOImpl();
	PassbookServiceImplementation psi = new PassbookServiceImplementation();
	private double balance;

	@Override
	public void addTransaction(long accNo, Transaction transaction) {
		dao.addTransaction(accNo, transaction);
	}

	@Override
	public void creditUsingSlip(long accNo, double amount, Account act) {
		dao.creditUsingSlip(accNo, amount);
		this.balance = act.getBalance() + amount;

		System.out.println("balance:"+this.balance);
		act.setBalance(this.balance);
		Passbook pb = new Passbook(accNo, amount, this.balance, "CREDIT");

		//System.out.println("balance:"+act.getBalance() +"act no: "+act.getAccNo());


	}

	@Override
	public void debitUsingSlip(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void creditUsingCheque() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void debitUsingCheque() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
