import java.util.Scanner;

/*Upper Triangular Matrix
An upper triangular matrix is a square matrix in which all the elements below the diagonal are zero. That is, all the non-zero elements are in the upper triangle: Write a JAVA program to find whether a given matrix is an upper triangular matrix or not.
Input Format:

The input consists of (n*n+1) integers. The first integer corresponds to the number of rows/columns in the matrix. The remaining integers correspond to the elements in the matrix. The elements are read in rowwise order, first row first, then second row and so on. Assume that the maximum value of m and n is 5.

 

Output Format:

Print "yes" if it is an upper triangular matrix . Print "no" if it is not an upper triangular matrix.

 

Sample Input 1:

2

1 2

0 3

 

Sample Output 1:

yes
*/

public class Q7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean isUpperTriangular = true;
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0; i<n;i++) {
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}

		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(j>i)
				{
					if(arr[i][j]==0)
						isUpperTriangular=true;
					else
						isUpperTriangular=false;
				}
				if(j<i)
				{
					if(arr[i][j]!=0)
						isUpperTriangular=true;
					else 
						isUpperTriangular=true;
				}
			}
		}
		if(isUpperTriangular==true)
		{
			System.out.println("yes");
		}
		else
			System.out.println("no");
		
	}
}
