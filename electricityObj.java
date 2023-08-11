package demo;

import java.util.Scanner;

public class electricityObj 
{
	double bill=0;
	String name;
	int unit;
	
	void input()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the consumer name = ");
		name=sc.nextLine();
		
		System.out.println("Enter the Unit = ");
		unit=sc.nextInt();
		
	}
	void calculate()
	{
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
	}
	void display()
	{
		System.out.println("Consumer name is = "+name);
		System.out.println("Your current unit is ="+unit);
		System.out.println("The bill amount is = "+bill);
	}
	
	public static void main(String args[])
	{
		electricityObj eobj = new electricityObj();
		eobj.input();
		eobj.calculate();
		eobj.display();
		
	}
}
