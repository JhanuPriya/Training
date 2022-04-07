package com.training;

import com.training.ifaces.Conditional;
import com.training.model.NewOjectFactory;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
NewOjectFactory factory = new NewOjectFactory();

Conditional profobject =factory .getConditional(1);
Conditional studobject = factory.getConditional(2);
System.out.println("Allowance:="+factory.getValue(profobject, "chennai"));
System.out.println("Allowance:="+factory.getValue(studobject, "30"));
Conditional principalObj = factory.getConditional(3);
System.out.println("Allowance:="+factory.getValue(principalObj, "engg"));

	}

}
