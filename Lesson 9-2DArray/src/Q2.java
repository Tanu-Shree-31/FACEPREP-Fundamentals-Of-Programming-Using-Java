import java.util.Scanner;

/*Maximum Element In Each Row
There are some students in the class. The class Adviser needs a recruitment's process for above 60% students. In each and every row there was a student above 60% . Help your adviser to find the students in each row.


Input Format:

The input consists of (m*n+2) integers. The first integer corresponds to m, the number of rows in the matrix and the second integer corresponds to n, the number of columns in the matrix. The remaining integers correspond to the elements in the matrix. The elements are read in row wise order, first row first, then second row and so on. Assume that the maximum value of m and n is 10.

 

Output Format:

Refer sample output for details.

 

Sample Input:

 

3

2

4 5

6 9

0 3

 Sample Output:

5

9

3
*/

public class Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int i=0,j=0;
		int arr[][]=new int[m][n];
		for(i=0; i<m;i++) {
			for(j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		int max=arr[0][0];
		for(i=0; i<m; i++)
		{
			for(j=0; j<n; j++)
			{
				if(arr[i][j]>max)
					max=arr[i][j];
			}
			System.out.println(max);
			max=0;
		}
	}
}
