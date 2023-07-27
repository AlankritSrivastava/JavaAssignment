package com.assignment.tdd.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.tdd.Exception.ExceptionClass;
import com.assignment.tdd.Model.Loan;
import com.assignment.tdd.Repository.LoanRepository;
import com.mysql.cj.log.Log;

@Service
public class LoanServices {// Service Class for iteraction with JPA Repository 
	
	private static final Logger log = LoggerFactory.getLogger(LoanServices.class);
	
	@Autowired
	LoanRepository repo;
	
	public List<Loan> getAllLoan(){
		List<Loan> ln = repo.findAll();
		return ln;
	}
	
	public Loan createNewLoan(Loan ln) {
		Loan pln = repo.save(ln);
		return pln;
	}
	
	public boolean validateLoan(Loan ln) {
		if(ln.getPayment_Date().after(ln.getDue_Date())) {
			throw new ExceptionClass("Payment Date cannot be greter then Due Date");
		}
		if(ln.getDue_Date().before(new java.util.Date())) {
			log.info("Due date is over. Payment start recurring Interest per day of "+ln.getInterestDay());
		}
		return true;
	}

}
