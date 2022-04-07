package com.training.model;
import com.training.ifaces.Conditional;
public class Principal implements Conditional {
private String typeofcollege;

public Principal() {
	super();
	// TODO Auto-generated constructor stub
}

public Principal(String typeofcollege) {
	super();
	this.typeofcollege = typeofcollege;
}

public String getTypeofcollege() {
	return typeofcollege;
}

public void setTypeofcollege(String typeofcollege) {
	this.typeofcollege = typeofcollege;
}

@Override
public boolean test(Object value) {
	// TODO Auto-generated method stub
	String typeofcollege = (String)value;
	boolean result = false;
	if(typeofcollege.equals("engg")) {
		result = true;
	}
	return false;
}


}