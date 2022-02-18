/*Comparing 2 integers
Get two integers x and y from the user and write a program to relate 2 integers as equal to, less than or 
greater than.

Input format:
Input consist of 2 integers
The first input corresponds to the first number(x)
The second input corresponds to the second number(y)

Output format:
If the first number is equal to the second number, print "x and y are equal". Otherwise, print "x greater 
than y" or "x less than y"
*/

import java.util.Scanner;
public class Q1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		 if(a<b)
      {
      System.out.printf("%d less than %d",a,b);
      }
      else if(a>b)
      {
      System.out.printf("%d greater than %d",a,b);
      }
      else
      {
      System.out.printf("%d and %d are equal",a,b);
      }
    }
}
