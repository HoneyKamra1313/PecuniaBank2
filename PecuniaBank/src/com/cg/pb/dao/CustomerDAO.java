package com.cg.pb.dao;

import com.cg.pb.bean.Address;
import com.cg.pb.bean.Customer;

public interface CustomerDAO {
	void addCustomerDetails(Customer customer,Address address) throws Exception;
	void udpateCustomer();
	void fetchCustomers();
	void deleteCustomer();

}
