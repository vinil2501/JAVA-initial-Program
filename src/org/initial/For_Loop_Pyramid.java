package org.initial;

public class For_Loop_Pyramid {
	public static void main(String[] args)
	  {
	     for(int a=9;a>=0;a--) 
	     {
	    	 for(int b=0;b<=a;b++)
	    	 {
		     System.out.print(" ");
	         }
	    	 for(int c=9;c>=a;c--)
	    	 {
	    	 System.out.print("* ");
	    	 }
	    	 System.out.println(); 
	    }
	     for(int a=0;a<=8;a++) 
	     {
	    	 for(int b=0;b<=a;b++)
	    	 {
		     System.out.print(" ");
	         }
	    	 for(int c=8;c>=a;c--)
	    	 {
	    	 System.out.print(" *");
	    	 }
	    	 System.out.println(); 
	    }	   
	  }
}
