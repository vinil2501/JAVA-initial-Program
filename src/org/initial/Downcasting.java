package org.initial;

public class Downcasting extends Upcasting {
	public void son() {
		System.out.println("Sons bike");	
		
	}

	public static void main(String[] args) {
		Upcasting i = new Downcasting();
		i.house();
	}
}
