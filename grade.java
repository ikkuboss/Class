package maths;

import java.util.Scanner;

public class grade 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the grade = ");
		char grade=sc.next().charAt(0);
		
		
		if(grade =='A')
		{
			System.out.println("90 - 100");
		}
		else if(grade == 'B')
		{
			System.out.println("80 - 90");
		}
		else if(grade == 'C')
		{
			System.out.println("70 - 80");
		}
		else if(grade == 'D')
		{
			System.out.println("60 - 70");
		}	
		else if(grade == 'E')
		{
			System.out.println("50 - 60");
		}
		else if(grade == 'F')
		{
			System.out.println("40 - 50");
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}
}
