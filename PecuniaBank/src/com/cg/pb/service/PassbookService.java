package com.cg.pb.service;

import java.time.LocalDate;

public interface PassbookService {
	public void accountSummary(double accNo,LocalDate startdate,LocalDate enddate);

}
