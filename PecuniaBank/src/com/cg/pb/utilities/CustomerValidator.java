package com.cg.pb.utilities;


import com.cg.pb.bean.Address;
import com.cg.pb.bean.Customer;

public class CustomerValidator {
	
	public void validate(Customer customer) throws Exception{
		
		isValidName(customer.getName());
		isValidContact(customer.getContact());
		isValidAadhar(customer.getAadhar());
		isValidDOB(customer.getDOB());
		isValidPAN(customer.getPAN());
		isValidGender(customer.getGender());
		isValidAddress(customer.getAddress());
		
	}
	
	private void isValidName(String name) {
		// TODO Auto-generated method stub
		
	}

	private void isValidContact(long contact) {
		// TODO Auto-generated method stub
		
	}

	private void isValidAadhar(long aadhar) {
		// TODO Auto-generated method stub
		
	}

	private void isValidDOB(String dob) {
		// TODO Auto-generated method stub
		
	}

	private void isValidPAN(String pan) {
		// TODO Auto-generated method stub
		
	}

	private void isValidGender(String gender) {
		// TODO Auto-generated method stub
		
	}

	private void isValidAddress(Address address) {
		// TODO Auto-generated method stub
		
	}

	public void isValidSalary(Integer salary) throws Exception{
//		if(salary==0)
//			throw new InvalidSalaryException("salary should not be zero");
		
	}

}
