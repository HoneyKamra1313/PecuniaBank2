package com.cg.pb.service;


import com.cg.pb.bean.*;

public interface CustomerService {
	void addCustomerDetails(Customer customer,Address address) throws Exception;
	void updateCustomerName(Account account,Customer customer) throws Exception;
	void updateCustomerContact(Account account,Customer customer);
	void updateCustomerAddress(Account account,Address address);
	void fetchEmployees();
	void deleteEmployee();
}
