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
	
	public static void main(String[] args) {
		palindrome();
		EvenOrOdd();
		armstrong();
	}

}
