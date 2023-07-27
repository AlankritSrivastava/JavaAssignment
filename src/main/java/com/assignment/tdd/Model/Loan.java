package com.assignment.tdd.Model;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Loan { // Model class for Loan Attributes
	
	@Id
	String Loan_ID;
	String Customer_Id;
	String Lender_Id;
	double Amount;	
	double Remaining_Amount;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "Payment_Date")
    Date Payment_Date;	
	
	float InterestDay;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "Due_Date")
    Date Due_Date;	
	
	float PenaltyDay;
	
	public Loan(String Loan_Id,String Customer_Id,double Amount){
		this.Loan_ID = Loan_Id;
		this.Customer_Id = Customer_Id;
		this.Amount = Amount;
	}
	
	
	public String getLoan_ID() {
		return Loan_ID;
	}
	public void setLoan_ID(String loan_ID) {
		Loan_ID = loan_ID;
	}
	public String getCustomer_Id() {
		return Customer_Id;
	}
	public void setCustomer_Id(String customer_Id) {
		Customer_Id = customer_Id;
	}
	public String getLender_Id() {
		return Lender_Id;
	}
	public void setLender_Id(String lender_Id) {
		Lender_Id = lender_Id;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
	public double getRemaining_Amount() {
		return Remaining_Amount;
	}
	public void setRemaining_Amount(double remaining_Amount) {
		Remaining_Amount = remaining_Amount;
	}
	public Date getPayment_Date() {
		return Payment_Date;
	}
	public void setPayment_Date(Date payment_Date) {
		Payment_Date = payment_Date;
	}
	public float getInterestDay() {
		return InterestDay;
	}
	public void setInterestDay(float interestDay) {
		InterestDay = interestDay;
	}
	public Date getDue_Date() {
		return Due_Date;
	}
	public void setDue_Date(Date due_Date) {
		Due_Date = due_Date;
	}
	public float getPenaltyDay() {
		return PenaltyDay;
	}
	public void setPenaltyDay(float penaltyDay) {
		PenaltyDay = penaltyDay;
	}


}
