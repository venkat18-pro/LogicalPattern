package org.company;

public class Pattern {

	public static void palindrome() {
		int num = 121, temp = num, rem=0,rev=0;
		while (num>0) {
			rem = num % 10;
			rev =rev * 10 + rem;
			num /=10;
		}
		if(temp == rev)
			System.out.println("Palindrome..");
		else
			System.out.println("Not Palindrome..");
	}
	
	public static void EvenOrOdd() {
		int i = 10;
		
		if(i%2 == 0)
			System.out.println("Even Number.");
		else
			System.out.println("Odd Number.");
	}
	
	public static void armstrong() {
		int num = 153,temp = num, total = 0; 
		while(num>0) {
			int a = 0;
			a = num % 10;
			num /= 10; 
			total += (a*a*a);
		}
		if(temp == total)
			System.out.println("Armstrong Number.");
		else
			System.out.println("Not a armstrong Number.");
	}
	
	public static void swap() {
		int a=10, b=20,c;
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("A: "+a);
		System.out.println("B: "+b);
	}
	
	public static void swap1() {
		int a=10, b=20;
		
		a = a+b;
		b= a-b;
		a= a-b;
		
		System.out.println("A: "+a);
		System.out.println("B: "+b);
	}
	
	public static void factorial() {
		
		int fact=1;
		
		for (int i = 1; i <= 5; i++) {
			fact *= i;
		}

		System.out.println("5 Factorial: "+fact);
		
	}
	
	public static void main(String[] args) {
//		palindrome();
//		EvenOrOdd();
//		armstrong();
//		swap();
//		swap1();
		factorial();
	}

}
