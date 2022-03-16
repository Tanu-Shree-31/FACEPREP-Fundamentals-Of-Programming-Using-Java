import java.util.Scanner;

/*SPECIAL NUMBER
Write a program to find all special numbers between 2 limits m and n(both inclusive). Assume that m and n are 2-digit numbers. A 2-digit number is said to be a special number if the sum of its digits and the products of its digits is equal to the number itself. For example, 19 is a special number. The digits in 19 are 1 and 9. The sum of the digits is 10 and the product of the digits is 9. 10+9 = 19.
Input Format:

Input consists of 2 integers m and n.



Output Format:

Refer Sample Output .



Sample Input:

11

30



Sample Output:

19

29
*/

public class Q10 {

	public static void main(String[] args) {
			
			Scanner sc =new Scanner(System.in);
			int sum=0,prod=1;
			int m=sc.nextInt();
			int n=sc.nextInt();
			for(int i=m; i<=n; i++)
			{
				int temp=i;
				
				
					int rem=i%10;
					int quo=i/10;
					sum=rem+quo;
					prod=rem*quo;
				
				if(sum+prod==temp)
					System.out.println(temp);
			}
				
		}
	}


