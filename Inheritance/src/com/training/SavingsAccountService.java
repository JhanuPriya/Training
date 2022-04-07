package com.training;

import com.training.SavingsAccount;
//before extends is subclass after extends is super class
public class SavingsAccountService extends BankAccountServices {
	
	public String getCustomerInfo(SavingsAccount account) {
return account.getAccountHolderName();
}

	@Override
	public double calculateInterest(BankAccount account) {
		
		double simpleInterest =0.10;
		if (account.getAccountNumber()<=5000) {
		// TODO Auto-generated method stub
			simpleInterest=0.20;
		}
		return account.getBalance()*1*simpleInterest;
	}

	
	}
	

