package org.initial;

public class For_Loop_Updown_Triangle 
{
  public static void main(String[] args)
  {
     for(int a=0;a<5;a++) 
     {
    	 for(int b=0;b<=a;b++)
    	 {
	     System.out.print("*");
         }
    	 System.out.println(); 
    }
     for(int a=5;a>=0;a--) 
     {
    	 for(int b=0;b<=a;b++)
    	 {
	     System.out.print("*");
         }
    	 System.out.println(); 
    }  
  }
}
