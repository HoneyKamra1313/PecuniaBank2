package com.cg.pb.dao;

import com.cg.pb.bean.Account;
import com.cg.pb.bean.Address;
import com.cg.pb.bean.Customer;

public interface AccountDAO {
	void addAccount(Account account,Customer customer,Address address) throws Exception;
	void udpateAccount();
	void fetchAccount(long accNo);
	void deleteAccount(long accNo);

}
