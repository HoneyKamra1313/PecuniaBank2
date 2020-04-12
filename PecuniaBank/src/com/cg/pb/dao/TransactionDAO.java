package com.cg.pb.dao;

import com.cg.pb.bean.Account;
import com.cg.pb.bean.Address;
import com.cg.pb.bean.Customer;
import com.cg.pb.bean.Transaction;

public interface TransactionDAO {
	void addTransaction(long accNo,Transaction transaction);
	void creditUsingSlip(long accNo,double amount);
	void debitUsingSlip(double amount);
    void creditUsingCheque();
	void debitUsingCheque();
}

