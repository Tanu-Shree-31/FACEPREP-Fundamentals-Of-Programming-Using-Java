import java.util.Scanner;

/*Sum of even numbers
Kuty and Pappu are playing a coding game. Kuty gives a set of numbers to Pappu to find the even numbers in the set and sum them. Write a program to help Pappu to solve the game and to win the dairy milk.
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
*/

public class Q5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sumeven=0;
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]%2==0) 
				sumeven=sumeven+arr[i];
		}
		System.out.println("The sum of the even numbers in the array is "+sumeven);	
	}

}
