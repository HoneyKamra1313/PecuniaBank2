package com.cg.pb.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PassbookServiceImplementation implements PassbookService {


	@Override
	public void accountSummary(double accNo, LocalDate startdate, LocalDate enddate) {

		long numOfDaysBetween = ChronoUnit.DAYS.between(startdate, enddate);
//	    return IntStream.iterate(0, i -> i + 1).limit(numOfDaysBetween).mapToObj(i -> startdate.plusDays(i)).collect(Collectors.toList());

	}



//	public void storeTransaction(Passbook pb) {
//		list.add(pb);
//	}

}
