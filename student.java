package maths;

import java.util.Scanner;

public class student 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the marks = ");
		int marks=sc.nextInt();
		
		if(marks<0 || marks>100)
		{
			System.out.println("Invalid Mark:");
		}
		else if(marks >=90)
		{
			System.out.println("A+");
		}
		else if(marks>=80)
		{
			System.out.println("A");
		}
		else if(marks>=70)
		{
			System.out.println("B");
		}
		else if(marks>=60)
		{
			System.out.println("C");
		}
		else if(marks>=50)
		{
			System.out.println("D");
		}	
		else if(marks>=40)
		{
			System.out.println("E");
		}
		else if(marks>=35)
		{
			System.out.println("F");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
