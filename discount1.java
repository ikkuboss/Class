package demo;

import java.util.Scanner;

public class discount1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of the product =");
		String p_name=sc.nextLine();
		
		System.out.println("Enter the prize of the product =");
		double p_prize = sc.nextDouble() ,discount =0;
		
		if(p_prize <= 1000)
		{
			discount = p_prize * 0.02;
		}
		else if(p_prize >= 1000 && p_prize <= 3000)
		{
			discount = p_prize * 0.1;
		}
		else if(p_prize > 3000)
		{
			discount = p_prize * 0.15;
		}
		System.out.println("Name of the product is = "+p_name);
		System.out.println("You've got discount of rs ="+discount);
		sc.close();
		
	}

}
