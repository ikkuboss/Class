/*1. Program to check the given number positive or negative
2.Program to check the given number is odd or even
3.Program to find the largest 2 numbers using if else*/

package maths;

import java.util.Scanner;

public class check 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number = ");
		int a=sc.nextInt();

		if(a>0)
		{
			System.out.println("The number is positive");
		}
		else if(a<0)
		{
			System.out.println("The number is negative");
		}
		else if(a%2==0)
		{
			System.out.println("The number is even");
		}
		else
		{
			System.out.println("The number is odd");
		}
	}
}
