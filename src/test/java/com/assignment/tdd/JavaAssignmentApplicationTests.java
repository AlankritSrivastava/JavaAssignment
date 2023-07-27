package com.assignment.tdd;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.assignment.tdd.Model.Loan;
import com.assignment.tdd.controller.LoanController;

@SpringBootTest
class JavaAssignmentApplicationTests {
	
	@Autowired
	LoanController lc;

	@Test
	void contextLoads() {
	}
	
	@Test
	void testAllLoanRecevied() {
		Loan ln = new Loan("L1","C1",10000);
		List<Loan> ll = (List<Loan>) lc.getallLoan();
		assertThat(1).isEqualTo(ll.size());
		assertThat("L1").isEqualTo(ll.get(0).getLoan_ID());
		assertThat("C1").isEqualTo(ll.get(0).getCustomer_Id());
	}
	
	
	
	

}
