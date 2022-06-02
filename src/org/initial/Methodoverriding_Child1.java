package org.initial;

public class Methodoverriding_Child1 extends Method_Overriding {
	
	@Override
	public void name(String a) {
		
		super.name(a);
	}
	@Override
	public void car(int a) {
		
		super.car(a);
	}
	public static void main(String[] args) {
		Methodoverriding_Child1 c=new Methodoverriding_Child1();
		c.name("VOI");
		c.car(23);
	}
	}

