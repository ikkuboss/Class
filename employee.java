package demo;

import java.util.Scanner;

class EmpDetail

{
	int e_id,salary;
	String name,dep;
	
	void input()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter employee name = ");
		name=sc.nextLine();
		
		System.out.println("Enter employee department = ");
		dep=sc.nextLine();
		
		System.out.println("Enter employee id = ");
		e_id=sc.nextInt();
		
		System.out.println("Enter employee salary = ");
		salary=sc.nextInt();	
		sc.close();
	}
	
	void display() 
	{
		System.out.println("Employee id is = "+e_id);
		System.out.println("Employee name is  = "+name);
		System.out.println("Employee department is  = "+dep);
		System.out.println("Employee's salary is = "+salary);
	}
}
public class employee
{
	public static void main(String args[])
	{
		EmpDetail Eob=new EmpDetail();
		Eob.input();
		Eob.display();
	}
}
