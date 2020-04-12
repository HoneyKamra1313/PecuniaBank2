package com.cg.pb.bean;

import java.time.LocalDate;

public class Transaction {
	private double amount;
	private LocalDate date;
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}

}
