package org.initial;

public class Fibonnaci 
{
	public static void main(String[] args) 
	{
		System.out.println("<-----FIBONACCI SERIES----->");
		int a=0,b=1,c,i=0;
		while (i<10)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println("              "+c);
			i++;
		}	
	}

}
