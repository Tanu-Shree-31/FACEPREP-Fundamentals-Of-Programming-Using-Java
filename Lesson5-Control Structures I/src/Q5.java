/*Trendy Numbers
Write a program to check whether the given number is a trendy number or not. A number is said to be a trendy number if and only if it has 3 digits and the middle digit is divisible by 3.
Input format:

The input containing an integer 'n' which denotes the given number



Output format:

If the given number is a trendy number, then print "Trendy Number". Otherwise, print "Not a Trendy Number".



Sample Input:

791



Sample Output:

Trendy Number
*/

import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>99 && n<=999)
		{
			n=n%100;
			n=n/10;
			if(n%3==0)
				System.out.println("Trendy Number");
			else
				System.out.println("Not a Trendy Number");
		}
		else
			System.out.println("Not a Trendy Number");

	}

}
