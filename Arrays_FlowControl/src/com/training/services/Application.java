package com.training.services;

import com.training.model.*;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BankAccountServices service =new BankAccountServices();
 BankAccount ram = new BankAccount(1200, "ramesh",5000);
 double simpleInterest =service.calculateInterest(ram);
 System.out.println("simple Interes @6%:="+simpleInterest);
 
 BankAccount shyam= new BankAccount(6200, "ramesh",5000);
 double simpleInterest2 =service.calculateInterest(shyam);
 System.out.println("simple Interes @6%:="+simpleInterest2);

 
// BankAccount[] accounts= new BankAccount[2];
//[0]= ram;
// accounts[1]= shyam;
//  service.calculateInterest(accounts);
 BankAccount[] accounts = {ram,shyam};
 service.calculateInterest(accounts);
 System.out.println("===========");
 
 double [] values = service.findInterest(accounts);
 for(double eachValue: values) {
	 System.out.println(eachValue);
 }
 BankAccount[] accountList = {
		 new BankAccount(800,"jay",5000,"savings"),
         new BankAccount(801,"kam",6000,"fixed") ,
         new BankAccount(802,"Tom",7000,"recuring"),
 };
 double [] interestValues = service.findInterestByAccountType(accountList);
               for(double eachvalue : interestValues) {
            	   System.out.println(eachvalue);
                
               }
	}

}
