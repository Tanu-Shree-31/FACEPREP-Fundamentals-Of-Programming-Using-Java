import java.util.Scanner;

/*Array median
Write a program to find the median of the elements in the array. Median is the middle value in the sorted list. If there are an even number of elements in the list, the median is the mean of the 2 middle values.
Input Format:

Input consists of n+1 integers where n corresponds to the number of elements in the array.

The first integer corresponds to n and the next n integers correspond to the elements in the array.

Output consists of a double value which corresponds to the median of the array and is printed up to 2 digits of precision.

Assume that the maximum number of elements in the array is 20.



Output Format:

Refer sample input and output for formatting specifications.



Sample Input:

5

2

4

1

3

5



Sample Output:

The median of the array is 3.00
*/

public class Q12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,t;
		double median=0;
		int n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
        {
            for(j=1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    t=a[j];
                    a[j]=a[i];
                    a[i]=t;
                }
            }
        }
		 if(n%2==1)
	        {
	            median=a[(n/2)+1];
	        }
	        else
	        {
	            if(n%2==0)
	            {
	                float  inter=a[n/2]+a[(n/2)+1];
	                median =inter/2.0;
	            }
	        }
	        System.out.printf("The median of the array is %.2f",median);
	}
}
