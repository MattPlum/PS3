package Account;

import java.util.Date;

import Exception.InsufficientFundsException ;

public class Account {
	
	public static void main(String[] args) {}
	
	// Declare private variables
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	// A no-arg constructor that creates a default account.
	public Account() {
		int id = 0;
		double balance = 0;
		double annualInterestRate = 0;
		Date dateCreated = this.dateCreated;		
	}
	
	// A constructor that creates an account with the specified id and initial balance (override).
	public Account(int id, double balance, double annualInterestRate) {
		
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = dateCreated;		
	}
	// Getters for the variables in Account 
	public int getID() {
		return this.id;
	}
	public double getBalance() {
		return this.balance;
	}
	public Date getDateCreated() {
		return this.dateCreated;
	}
	
	// Returns monthly interest rate
	public double getMonthlyInterestRate() {
		return this.annualInterestRate;
	}
	
	// Withdraws a specified amount from the account, tests for insufficient funds
	public void withdraw(double amount) throws InsufficientFundsException
	{
		if(amount <= balance) {
			balance = balance - amount;
		} else {
			double required = amount - balance;
			throw new InsufficientFundsException(required);
		}
	}
	
	// Deposits a specified amount to the account
	public void deposit(double amount) {
		balance += amount;
	}
}