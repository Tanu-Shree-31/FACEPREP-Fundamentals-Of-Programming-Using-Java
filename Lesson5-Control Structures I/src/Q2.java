/*Factorial Number
Write a program to determine whether 'n' is a factorial number or not. Factorial of a number is the product 
of all positive numbers from 1 to 'n'.*/
import java.util.Scanner;
public class Q2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int fact=1,i=1;
		int n=sc.nextInt();
		while(fact<n)
		{
			fact=fact*i;
			i++;
		}
		if(fact==n)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
