package com.cg.pb.dao;

import java.util.HashMap;
import com.cg.pb.bean.Transaction;

public class TransactionDAOImpl extends AccountDAOImpl implements TransactionDAO {

	HashMap<Long, Transaction> transList = new HashMap<Long, Transaction>();
	CustomerDAOImpl cdi = new CustomerDAOImpl();

	@Override
	public void addTransaction(long accNo, Transaction transaction) {

		for (long i : accList.keySet()) {
			if (i == accNo) {
				transList.put(accNo, transaction);
			}
		}

	}

	@Override
	public void creditUsingSlip(long accNo, double amount) {

		for (long i : accList.keySet()) {
			if (i == accNo) {
//
//				super.setBalance(super.getBalance() + amount);
//				System.out.println(super.getBalance());
				System.out.println("Credited Successfully");

			}
		}
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
