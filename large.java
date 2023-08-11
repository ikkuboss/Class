package maths;

import java.util.Scanner;

public class large 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c,d,i;
		
		//Two numbers
		System.out.println("Enter the first number = ");
		a=sc.nextInt();
		
		System.out.println("Enter the second number = ");
		b=sc.nextInt();
		
		i=(a>b)?a:b;		
		System.out.println("The largest of " +a +" and " +b +" is = " +i);
	
		//Three numbers
		System.out.println("Enter the first number = ");
		a=sc.nextInt();
		
		System.out.println("Enter the second number = ");
		b=sc.nextInt();
		
		System.out.println("Enter the third number = ");
		c=sc.nextInt();
		
		i=(a>b && a>c)?a : (b>c && b>a)?b : c ;
		System.out.println("The largest of " +a +" and " +b +" and " +c +" is = " +i);
	
		//Four numbers
		System.out.println("Enter the first number = ");
		a=sc.nextInt();
		
		System.out.println("Enter the second number = ");
		b=sc.nextInt();
		
		System.out.println("Enter the third number = ");
		c=sc.nextInt();
		
		System.out.println("Enter the fourth number = ");
		d=sc.nextInt();
		
		sc.close();
		
		i=(a>b && a>c && a>d)?a : (b>a && b>c && b>d)?b : (c>a && c>b && c>d)?c : d;
		System.out.println("The largest of " +a +" and " +b +" and " +c +" and " +d +" is = " +i);
		
	}
}
