package demo;

import java.util.Scanner;

public class electricity
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Unit = ");
		int unit=sc.nextInt();
		
		double bill=0;
		
		//For less then or equal to 200
		if(unit<=200)
		{
			bill = unit * 3.08;
		}
		
		//For more than 200 and up to 300
		else if(unit>200 || unit<=300)
		{
			bill = 200*3.08 +(unit-200) * 4.40 ;
		}
		
		//For more than 300 and up to 400
		else if(unit>300 || unit<=400)
		{
			bill = 200*3.08 +100*4.40 +(unit-300)*5.10;
		}
		
		//For more than 400 
		else if(unit<400)
		{
			bill = 200*3.08+100*4.40+100*5.10+(unit-400)*5.80;	
		}
		System.out.println("Your bill amount is = "+bill);
	}
}
