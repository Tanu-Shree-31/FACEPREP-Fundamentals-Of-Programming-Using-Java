import java.util.Scanner;

/*Sum of even numbers and sum of odd numbers
Arun and Kalai were playing a puzzle game with a given set of numbers. They need to find the odd and even numbers and find the sum of the odd numbers and the sum of the even numbers. Write a program to help them to solve the puzzle game and to win the mobile phone.
Input Format:

Input consists of n+1 integers. 

The first integer corresponds to ‘n’, the size of the array. 

The next ‘n’ integers correspond to the elements in the array. 

Assume that the maximum value of n is 15.



Output Format:

Refer to sample output for details.



Sample Input:

5

2

3

6

8

-1



Sample Output:

The sum of the even numbers in the array is 16

The sum of the odd numbers in the array is 2
*/


public class Q7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sumeven=0,sumodd=0;
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]%2==0)
				sumeven=sumeven+arr[i];
			else
				sumodd=sumodd+arr[i];
		}
		System.out.println("The sum of the even numbers in the array is "+sumeven);
		System.out.println("The sum of the odd numbers in the array is "+sumodd);	
	}
}
