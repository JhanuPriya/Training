package com.training;
import com.training.ifaces.Function;
import com.training.ifaces.CheckCondition;
import com.training.ifaces.Conditional;
import com.training.ifaces.CurrencyConverter;
import com.training.ifaces.DiscountCondition;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//subtype= new subtype
		//CuurencyConverter = new Currency Converter
		//supertype=subtype
Function conv = new CurrencyConverter();
double response  = conv.apply(200);
System.out.println(Function. COUNTER);
System.out.println(response);
System.out.println(conv.apply(300));
if(conv instanceof CheckCondition) {
	CheckCondition obj =(CheckCondition)conv;
	System.out.println("Is Discount Allowed:="+obj.test(300));
}else {
	System.out.println("cannot be cast");
}

Conditional condObj = new DiscountCondition();
System.out.println(condObj.test(6000));
System.out.println(condObj.negate(6000));

	}

}
