package com.cg.pb.dao;

import com.cg.pb.bean.Account;
import com.cg.pb.bean.Address;
import com.cg.pb.bean.Customer;

import java.util.HashMap;

public class AccountDAOImpl extends Account implements AccountDAO  {
	
	HashMap<Long,Account> accList = new HashMap<Long,Account>();
	CustomerDAOImpl cdi = new CustomerDAOImpl();

	@Override
	public void addAccount(Account account, Customer customer, Address address) throws Exception {
		
		accList.put(account.getAccNo(), account);
		cdi.addCustomerDetails(customer, address);	
	};

	@Override
	public void udpateAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fetchAccount(long accNo) {
//		for(long i : accList.keySet()) {
//			if(i==accNo) {
//				System.out.println(accList.get(i));
//			}
//		}
		Account details = new Account().getAccountDetails(accNo);
		System.out.println(details);

		
	}

	@Override
	public void deleteAccount(long accNo) {
		for(long i : accList.keySet()) {
			if(i==accNo) {
				System.out.println(accList.remove(i));
				System.out.println("Account Deleted Successfully");
			}
			else {
				System.out.println("Account does not exist");
			}
		}
		
		
	}

	
	


}
