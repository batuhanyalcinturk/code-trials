package firstjavacodes;

import java.util.Scanner;

public class GcdLcm {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int s1, s2, gcd = 1, lcm;
		
		System.out.println("Enter Numbers : ");
		s1 = scan.nextInt();
		s2 = scan.nextInt();
		
		int min = (s1 < s2) ? s1 : s2;
		
		for(int i = min; i > 0; i--)
		{
			if ((s1 % i == 0) && (s2 % i == 0)) 
			{
				gcd = i;
				break;
			}
		}
		
		lcm = (s1 * s2) / gcd;
		System.out.println("Gcd : " + gcd);
		System.out.println("Lcm : " + lcm);

	}

}
