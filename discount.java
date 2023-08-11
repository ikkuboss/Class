package demo;

import java.util.Scanner;

public class discount {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the product name = ");
		String p_name=sc.nextLine();
		
		System.out.println("Enter the product price = ");
		double p_p=sc.nextDouble() , discount = 0 , total = 0;
		
		if(p_p<=10000)
		{
			discount = p_p * 0.05;
		}
		else if(p_p>=10000 && p_p<=20000)
		{
			discount = p_p * 0.1;
		}
		else if(p_p>=20000 && p_p<=35000)
		{
			discount = p_p * 0.15;
		}
		else if(p_p>=35000)
		{
			discount = p_p * 0.2;
		}
		else
		{
			System.out.println("Pay full price = "+p_p);
		}
		total = p_p - discount;
		System.out.println("Your product is ="+p_name);
		System.out.println("Your amount before discount is ="+p_p);
		System.out.println("Your amount after discount is ="+total);
	}

}
