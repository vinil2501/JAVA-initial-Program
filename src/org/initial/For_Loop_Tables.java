package org.initial;

import java.util.Scanner;

public class For_Loop_Tables {
	public static void main(String[] args)
    {
	Scanner h = new Scanner(System.in);
	System.out.println("Enter the table number");
	int k = h.nextInt();
    	 for(int b=0;b<11;b++)
    	 { 
	     System.out.println(b+ "x" +k+"="+b*k);
    	 }
     
    }
	
}



