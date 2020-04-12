package com.cg.pb.service;

import com.cg.pb.bean.Account;
import com.cg.pb.bean.Address;
import com.cg.pb.bean.Customer;
import com.cg.pb.dao.CustomerDAOImpl;
import com.cg.pb.utilities.CustomerValidator;

public class CustomerServiceImpl implements CustomerService{
	CustomerValidator validator=new CustomerValidator();
	CustomerDAOImpl dao = new CustomerDAOImpl();

	@Override
	public void addCustomerDetails(Customer customer, Address address) throws Exception {
		
		try {
			validator.validate(customer);
			dao.addCustomerDetails(customer, address);
		}
		catch(Exception e){
			throw e;
		}
		
	}

	@Override
	public void updateCustomerName(Account account, Customer customer) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCustomerContact(Account account, Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCustomerAddress(Account account, Address address) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fetchEmployees() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee() {
		// TODO Auto-generated method stub
		
	}


	

}
