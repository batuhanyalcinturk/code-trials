package firstjavacodes;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int n1=0;
		int n2=1;
		int total=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number : ");
		
		int input = scan.nextInt();
		
		for(int i=1; i<=input; i++)
		{
			System.out.println(n1);
			
			total = n1 + n2;
			n1=n2;
			n2 = total;
		}

	}

}
