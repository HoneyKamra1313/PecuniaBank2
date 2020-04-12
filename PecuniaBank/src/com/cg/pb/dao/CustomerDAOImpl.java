package com.cg.pb.dao;


import java.util.ArrayList;

import com.cg.pb.bean.Address;
import com.cg.pb.bean.Customer;

public class CustomerDAOImpl implements CustomerDAO {
	
	ArrayList<Customer> custList = new ArrayList<Customer>();
	ArrayList<Address> addrList= new ArrayList<Address>();

	@Override
	public void addCustomerDetails(Customer customer, Address address) throws Exception {
		
		custList.add(customer);
		addrList.add(address);
		
	}

	@Override
	public void udpateCustomer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fetchCustomers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomer() {
		// TODO Auto-generated method stub
		
	}

	


}
