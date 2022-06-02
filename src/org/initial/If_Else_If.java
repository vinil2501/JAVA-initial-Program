package org.initial;

import java.util.Scanner;

public class If_Else_If {

	public static void main(String[] args) {
		Scanner M=new Scanner(System.in);
		System.out.println("Enter the mark");
		int mark = M.nextInt();
		if(mark<35)
		{
			System.out.println("FAIL");
		}
		else if(mark<=50)
		{
			System.out.println("Grade-D");
		}
		else if(mark<=70)
		{
			System.out.println("Grade-C");
		}
		else if(mark<=80)
		{
			System.out.println("Grade-B");
		}
		else if(mark<=100)
		{
			System.out.println("Grade-A");
		}
		else
		{
			System.out.println("Enter the valid Mark");
		}
	}
}
