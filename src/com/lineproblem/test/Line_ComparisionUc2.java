package com.lineproblem.test;

import java.util.Scanner;

public class Line_ComparisionUc2 {

	public static void main(String[] args) {

		
		int x1=0,x2=0,y1=0,y2=0,a1,a2,b1,b2;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value x1:");		
		x1=sc.nextInt();
		System.out.println("enter the value y1:");
		y1=sc.nextInt();
		System.out.println("enter the value x2:");
		x2=sc.nextInt();
		System.out.println("enter the value y2:");
		y2=sc.nextInt();
		
		int length1 =(int)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		
		Integer L1=length1;
		System.out.println("enter the value a1:");
		a1=sc.nextInt();
		System.out.println("enter the value b1:");
		b1=sc.nextInt();
		System.out.println("enter the value a2:");
		a2=sc.nextInt();
		System.out.println("enter the value b2:");
		b2=sc.nextInt();
		
		int length2= (int)Math.sqrt((a2-a1)*(a2-a1)+(b2-b1)*(b2-b1));
		
		Integer L2=length2;
		
		if(L1.equals(L2))
		{
		System.out.println("Two lines are equal ");
	    }
		else
		{
	 System.out.println("two lines are not equal");
		}
	}
	
}
