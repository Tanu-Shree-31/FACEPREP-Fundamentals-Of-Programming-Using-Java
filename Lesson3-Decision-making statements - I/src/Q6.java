/*Age Detector
Ask a user for their birth year encoded as two digits (like "62") and for the current year, also encoded as 
two digits (like "99"). Write a program to find the users current age in years.

Input format:
Input consists of 2 integers
The first integer corresponds to the last 2 digits of the birth year
The second integer corresponds to the last 2 digits of the current year

Output format:
Print the user's current age
Refer below sample output for formatting.

Sample Input:
62
00

Sample Output:
38
*/

import java.util.Scanner;
public class Q6 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
	      int a = s.nextInt();
	      int b = s.nextInt();
	      int c = (100-a)+b;
	      int d = b-a;
	      if(a>b)
	      {
	        System.out.printf("%d",c);
	      }
	      else
	      {
	        System.out.printf("%d",d);
	      }
	}
}
