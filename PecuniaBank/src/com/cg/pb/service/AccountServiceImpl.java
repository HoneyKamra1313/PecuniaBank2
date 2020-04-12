package com.cg.pb.service;

import java.util.ArrayList;
import java.util.stream.Collectors;

import com.cg.pb.bean.Account;
import com.cg.pb.bean.Address;
import com.cg.pb.bean.Customer;
import com.cg.pb.dao.AccountDAOImpl;
import com.cg.pb.dao.CustomerDAOImpl;
import com.cg.pb.utilities.CustomerValidator;

public class AccountServiceImpl implements AccountService{
	
//	CustomerValidator validator=new CustomerValidator();
	AccountDAOImpl dao = new AccountDAOImpl();
	 
	@Override
	public void addAccount(Account account, Customer customer, Address address) throws Exception {
		try {
//			validator.validate(customer);
			dao.addAccount(account, customer, address);
		}
		catch(Exception e){
			throw e;
		}
	}

	@Override
	public void fetchAccount(long accNo) {
		
		dao.fetchAccount(accNo);
		
	}

	@Override
	public void deleteAccount(long accNo) {
		dao.deleteAccount(accNo);
	}
	
}
