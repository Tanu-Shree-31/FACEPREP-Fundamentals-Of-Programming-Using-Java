import java.util.Scanner;

/*Distinct elements
Write a program to find the number of distinct elements in an unsorted array. [Do it without sorting the array]
Input Input:

Input consists of n+1 integers. 

The first integer corresponds to n, the number of elements in the array. 

The next n integers correspond to the elements in the array. 

Assume that the maximum value of n is 15.



Output Format:

Output consists of a single integer which corresponds to the number of distinct elements in the array.



Sample Input:

5

3

2

3

780

90



Sample Output:

4
*/

public class Q6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++) 
			arr[i]=sc.nextInt();
		  for(int i=0;i<n;i++)
	        {
	            int f=0;
	            for(int j=0;j<n;j++)
	            {
	                if(i==j)
	                	continue;
	                if(arr[i]==arr[j] && (i>j))
	                    f=1;  
	            }
	            if(f==0)
	                c++;
	        }
	        System.out.printf("%d",c);		
	}

}
