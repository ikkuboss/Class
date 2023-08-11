package demo;

import java.util.Scanner;

class studentdetails
{
	int roll_no,std;
	String name;
	
	void input()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter student name = ");
		name=sc.nextLine();
		
		System.out.println("enter student roll no = ");
		roll_no=sc.nextInt();
		
		System.out.println("enter the student's class = ");
		std=sc.nextInt();	
		sc.close();
	}
	
	void display() 
	{
		System.out.println("student name is = "+name);
		System.out.println("roll no of the student is = "+roll_no);
		System.out.println("student's class is = "+std);
	}
}
public class encapsulation 
{
	public static void main(String args[])
	{
		studentdetails sob=new studentdetails();
		sob.input();
		sob.display();
	}
}
