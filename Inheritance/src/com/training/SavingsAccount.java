package com.training;

public class SavingsAccount extends BankAccount {
private String nominee;
//public SavingsAccount() {
	//System.out.println("constructor of SUB CLASS Called");
//}
//public SavingsAccount() {
//	super(1020,"ram",5000);
//	
//	System.out.println("constructor of three sub class");
//}



public SavingsAccount() {
	super();
}

public String getNominee() {
	return nominee;
}

public void setNominee(String nominee) {
	this.nominee = nominee;
}

public SavingsAccount(int accountNumber, String accountHolderName, double balance, String accountType, String nominee) {
	super(accountNumber, accountHolderName, balance, accountType);
	this.nominee = nominee;
}

}
