package com.cg.pb.service;

import com.cg.pb.bean.*;

public interface TransactionService {
	void addTransaction(long accNo,Transaction transaction);
	void creditUsingSlip(long accNo,double amount,Account act);
	void debitUsingSlip(double amount);
    void creditUsingCheque();
	void debitUsingCheque();
}
