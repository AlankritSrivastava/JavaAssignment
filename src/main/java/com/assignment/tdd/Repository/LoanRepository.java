package com.assignment.tdd.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.tdd.Model.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, String> {// JPA Repository for functionality with Database

}
