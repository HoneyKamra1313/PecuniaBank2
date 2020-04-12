package com.cg.pb.utilities;

public class Utilities {
	public static boolean nameValidate(String name) {
		String pattern = "[A-Za-z]{3,10}";
		if(name.matches(pattern))
			return true;
		return false;
	}
	public static boolean accIdValidate(String accId) {
		String pattern = "[0-9]{12}";
		if(accId.matches(pattern))
			return true;
		return false;
	}
	public static boolean accNoValidate(String accNo) {
		String pattern = "[0-9]{12}";
		if(accNo.matches(pattern))
			return true;
		return false;
	}
	public static boolean contactValidate(String contact) {
		String pattern = "[0-9]{10}";
		if(contact.matches(pattern))
			return true;
		return false;
	}
	public static boolean aadharValidate(String aadhar) {
		String pattern = "[0-9]{12}";
		if(aadhar.matches(pattern))
			return true;
		return false;
	}
	public static boolean dateValidate(String date) {
		String pattern = "[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}";
		if(date.matches(pattern))
			return true;
		return false;
	}
	public static boolean panValidate(String pan) {
		String pattern = "[a-zA-Z]{5}[0-9]{4}[a-zA-Z]{1}";
		if(pan.matches(pattern))
			return true;
		return false;
	}
	public static boolean amountValidate(int Amount) {
		if(Amount >= 1000 && Amount <= 100000) return true;
		return false;
	}
	public static boolean optionValidate(String option) {
		String pattern = "[1-4]{1}";
		if(option.matches(pattern)) return true;
		return false;
	}
	public static boolean noOfCustomerValidate(String n) {
		String pattern = "[0-9]{1,2}";
		if(n.matches(pattern)) return true;
		return false;
	}

}
