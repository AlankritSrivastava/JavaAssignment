package com.assignment.tdd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.tdd.Model.Loan;
import com.assignment.tdd.Service.LoanServices;

@RestController
public class LoanController {// Controller Class For Rest Api's
	
	@Autowired
	private LoanServices service;
	
	
	@PostMapping("/loan")
	public ResponseEntity<Loan> createProduct(@RequestBody Loan ln) {// Insertion of Record using Post Method
		
		if(service.validateLoan(ln)) {// Check for validation  before saving into database
			Loan pln = service.createNewLoan(ln);
			return new ResponseEntity<Loan>(pln,HttpStatus.CREATED);
		} else {
			return new ResponseEntity<Loan>(HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("/loan")
	public ResponseEntity<List<Loan>> getallLoan() {// retrival of all the loan recoed
		List<Loan> ln = service.getAllLoan();
		return new ResponseEntity<List<Loan>>(ln,HttpStatus.FOUND);
	}

}
