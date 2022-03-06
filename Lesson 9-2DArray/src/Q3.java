import java.util.Scanner;

/*Maximum Element In Each Column
In a family the people are arranged in rows and columns. Male persons in the families arranged in a row and females are arranged in a column. Find the biggest women in the each column.Help me to find the biggest women. Write a program to find the maximum element in each column of the matrix.


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

6 

9
*/

public class Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int arr[][]=new int[m][n];
		for(int i=0; i<m;i++) {
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		int max=arr[0][0];
		for(int j1=0; j1<n; j1++)
		{
			for(int i1=0;i1<m;i1++)
			{
				if(arr[i1][j1]>max)
					max=arr[i1][j1];
			}
			System.out.println(max);
			max=0;
		}

	}

}
