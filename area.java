package maths;

import java.util.Scanner;

public class area 
{
	public static void main(String[] args) 
	{
		int height ,base ,length ,breadth , a , radius;
		
		//area of triangle
		
		//user input
		Scanner sc = new Scanner(System.in);
		
		//height
		System.out.println("enter height =");
		height = sc.nextInt();
		
		//base
		System.out.println("enter base =");
		base=sc.nextInt();
		
		//area
		double ta=0.5* base * height;
		System.out.println("area of triangle is = "+ta);
		
		//area of rectangle
		
		//lenght
		System.out.println("enter length =");
		length = sc.nextInt();
		
		//breadth
		System.out.println("enter breadth =");
		breadth = sc.nextInt();
		
		//area
		int ra = length * breadth;
	
		System.out.println("area of rectangle is = "+ra);

		//area of square

		//sides
		System.out.println("enter sides =");
		a = sc.nextInt();
		
		//area
		int sa = a*a;

		System.out.println("area of square is = "+sa);
		
		//are of circle
		
		//radis
		System.out.println("enter the radius = ");
		radius = sc.nextInt();
		
		//area
		double ca = 3.14 * radius*radius;
		
		System.out.println("area of circle is = "+ca);
	}

}
