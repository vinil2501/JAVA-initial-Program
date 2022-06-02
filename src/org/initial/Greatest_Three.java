package org.initial;

import java.util.Scanner;

public class Greatest_Three {
	public static void main(String[] args) {
		Scanner M=new Scanner(System.in);
		System.out.println("Enter the first Number");
		int no1 = M.nextInt();
		System.out.println("Enter the second Number");
		int no2 = M.nextInt();
		System.out.println("Enter the third Number");
		int no3 = M.nextInt();
		if(no1>no2 && no1>no3)
		{
			System.out.println(no1 + " is greater");
		}
		else if(no2>no1 && no2>no3)
		{
			System.out.println(no2 + " is greater");
		}
		else
		{
			System.out.println(no3 + " is greater");
		}
	}
}

