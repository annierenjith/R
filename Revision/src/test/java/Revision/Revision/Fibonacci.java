package Revision.Revision;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
	//	Fibonacci- 0 1 1 2 3 5 8 13 
		int num1=0;
		int num2=1;
		int num3=1;
		int i=0;
	
		int res;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int count =sc.nextInt();
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		while(i!=count)
		{
			res=num2+num3;
			num2=num3;
			num3=res;
			System.out.println(res);
			i++;
		}
		
		
		
	}

}
