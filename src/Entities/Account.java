	package Entities;

import Exceptions.DomainException;

public class Account {
	
		public Integer number;
		public String holder;
		public Double balance;
		public Double withdrawLimit;
		
		
	public Account() {
		
	}
	
	
	public Account(Integer number, String holder, Double balance, Double withdrawlimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawlimit;
	}
	
	
	public Integer getNumber() {
		return number;
	}
	
	
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	
	public String getHolder() {
		return holder;
	}
	
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	
	public Double getBalance() {
		return balance;
	}
	
	
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	
	public Double getWithdraw() {
		return withdrawLimit;
	}
	
	
	public void setWithdraw(Double withdraw) {
		this.withdrawLimit = withdraw;
	}
		
		public void deposit(Double amount)  {
			
			balance += amount;
			
		}
	
	    public void withdraw(Double amount) throws DomainException {
	    	if (balance <  amount) {
	    		throw new DomainException("Not enough balance");	 	
	    	}
	    	if (amount > withdrawLimit) {
	    		throw new DomainException ("The amount exceeds withdraw limit");
	    	}
	    	
	        	balance -= amount;
	    }
		
	}
