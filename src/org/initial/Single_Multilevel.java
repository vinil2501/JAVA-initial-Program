package org.initial;

public class Single_Multilevel extends Hybrid_Parent {
private void Land() {
	System.out.println("My Land");
}
public static void main(String[] args) {
	Single_Multilevel f= new Single_Multilevel();
	f.Land();
	f.House();
}
}
