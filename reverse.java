package maths;

public class reverse
{
	public static void main(String args[])
	{
		int num=654321 ,temp=0;
		
		temp = num%10;
		System.out.print(temp);
		temp = num/10;
		temp = temp%10;
		System.out.print(temp);
		temp = num/10;
		temp = temp/10;
		System.out.print(temp);
		
		
	
		
		
	}
}
