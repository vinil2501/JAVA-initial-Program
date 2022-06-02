package org.initial;

import java.util.Scanner;

public class Switch_Statement 
{
	public static void main(String[] args) 
	{
	 int i=0;
	 while (i<=3) 
	 {	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the Input");
	 String input = sc.nextLine();
	 switch (input)
		 {
			 case "Bottle":
			 System.out.println("It is used to store things");
			 break;	 
			 
			case "Pen":
			System.out.println("It is used for writing");
			break;	
			 
			case "Mobile":
			System.out.println("It is a mini world in our palm");
			break;
			 
			default:
			System.out.println("Enter a valid input");
			break;
		 }
	 i++;
	 }
	 }
}



