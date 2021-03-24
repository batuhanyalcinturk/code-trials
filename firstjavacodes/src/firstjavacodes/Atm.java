package firstjavacodes;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		
		int balance = 1000, input, amount;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Current Balance " + balance);
		
		while(balance > 0)
		{
			System.out.println();
			System.out.println("1-) Deposit");
			System.out.println("2-) Withdraw");
			System.out.println("3-) Balance Inquiry");
			System.out.println("4-) Exit");
			System.out.print("Select the action you want to do : ");
			input = scan.nextInt();
			
			if (input == 1) 
			{
				System.out.println("Amount you want to deposit : ");
				amount = scan.nextInt();
				balance += amount;
			}
			else if(input == 2)
			{
				System.out.println("Amount you want to withdraw :");
				amount = scan.nextInt();
				if (amount > balance) 
				{
					System.out.println("Insufficient Balance");
				}
				else
				{
					balance -= amount;
				}
				
			}
			else if(input == 3)
			{
				System.out.println("Current Balance : " + balance);
			}
			else if(input == 4)
			{
				System.out.println("Exiting");
				break;
			}
			else
			{
				System.out.println("Invalid Transaction");
			}
		}
	}

}
