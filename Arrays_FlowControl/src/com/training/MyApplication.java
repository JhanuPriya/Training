package com.training;
import com.training.services.BankAccountServices;
import com.training.model.*;
import java.util.*;

public class MyApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   BankAccountServices service =new BankAccountServices();
   BankAccount [] list = new BankAccount[3];
   int idx =0;
   int choice=0; 
   Scanner sc= new Scanner(System.in);
   
      do {
    	  
    	  System.out.println("enter the accountNumber");
    			  int accountNumber= sc.nextInt();
    			  System.out.println(" enter the accountHolderNmae");
    			  String accountHolderName =sc.next();
    			 System.out.println(" ENTER THE BALANCE");
    			 double accountbalance = sc.nextDouble();
    			 System.out.println(" enter the account type[saving,fixed]");
    			 String accounttype =sc.next();
    			 BankAccount account = new BankAccount(accountNumber,accountHolderName,accountbalance,accounttype);
    			 list[idx]=account;
    			 System.out.println("enter 0 to end 1 continue");
    			 choice=sc.nextInt();
    			 
    			 
    	 }while(choice==1);
    	  double[] values = service.findInterestByAccountType(list);
    	  for( double eachValue: values) {
    		  System.out.println(eachValue); 
    	  }
    	  
    	  
sc.close();
	}

}
