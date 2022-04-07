package com.training;
import com.training.SavingsAccount;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BankAccount ramsaccount = new BankAccount(1010,"ramesh",5000,"savings");
System.out.println(ramsaccount);

         SavingsAccount account = new SavingsAccount(650,"ramesh",678,"joint","rajesh");
System.out.println(account.getAccountHolderName());
System.out.println(account.getNominee());
SavingsAccountService service = new SavingsAccountService();
System.out.println(service.getCustomerInfo(account));
System.out.println(service.calculateInterest(account));
BankAccountServices service2 = new SavingsAccountService();
SavingsAccountService savingService2=(SavingsAccountService)service2;
BankAccountServices sc2 = new SavingsAccountService();
System.out.println(savingService2.getCustomerInfo(account));



	}

}
