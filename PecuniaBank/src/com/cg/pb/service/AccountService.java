package com.cg.pb.service;

import com.cg.pb.bean.*;


public interface AccountService {
	
	void addAccount(Account account,Customer customer,Address address) throws Exception;
	void fetchAccount(long accNo);
	void deleteAccount(long accNo);

}
