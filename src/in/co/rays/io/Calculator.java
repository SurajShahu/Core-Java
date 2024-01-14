package in.co.rays.io;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		String operator=null;
		double a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of A");
		a=sc.nextDouble();
		System.out.println("Enter value of B");
		b=sc.nextDouble();
		System.out.println("Enter the operator");
		operator=sc.next();
		switch(operator)
		{
		case "+":
			c=a+b;
			System.out.println(c);
			break;
		case "-":
			c=a-b;
			System.out.println(c);
			break;
		case "*":
			c=a*b;
			System.out.println(c);
			break;
		case "/":
			c=a/b;
			System.out.println(c);
			break;
		default:
				System.out.println("operator error");
				break;
		}
		
	}
}
