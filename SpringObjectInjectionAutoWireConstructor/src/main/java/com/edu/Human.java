package com.edu;

public class Human {
	private Heart heart;
	//AutoWire constructor
	
	public Human(Heart heart) {
		super();
		this.heart= heart;
	}
	

public void humanFunction() {
	if(heart!=null) {
		heart.pump();
	}
	else {
	   System.out.println("Not Alive");
	}
}
}




