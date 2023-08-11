package maths;

import java.util.Scanner;

public class voting 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the age =");
		int age=sc.nextInt();
	
		if (age>=18)
		{
			System.out.println("You are eligible for voting");
		}
		else if(age==0)
		{
			System.out.println("Invalid Age");
		}
		else if(age<0)                       
		{
			System.out.println("Invalid input(negative input)");
		}
		else
		{
			System.out.println("you are not eligible");
		}
	}
}
