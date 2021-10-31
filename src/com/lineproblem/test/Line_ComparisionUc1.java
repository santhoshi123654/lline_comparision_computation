package com.lineproblem.test;

import java.util.Scanner;

public class Line_ComparisionUc1 {
	
	
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter the point of x1 :");
	int x1= sc.nextInt();
	System.out.println("Enter the point of y1 :");
	int y1=sc.nextInt();
	System.out.println("Enter the point of x2 :");
	int x2=sc.nextInt();
	System.out.println("Enter the point of y2 :");
	int y2=sc.nextInt();

	/*int x1=4;
	int x2=10;
	int y1=8;
	int y2=12;
	int AC=(x2-x1);
	int BD=(y2-y1);
	System.out.println("the AC value is : " +AC);
	System.out.println("the BD value is :" +BD);
	*/
	double dis= Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

	System.out.println("The Length of a Line is : " +dis);
 
	}
	
}
