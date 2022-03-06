import java.util.Scanner;

/*Diagonal Matrix
Diagonal Matrix. A square matrix which has zeros everywhere other than the main diagonal. Entries on the main diagonal may be any number, including 0. Write a program to find whether a given matrix is a diagonal matrix or not.


Input Format:

The input consists of (n*n+1) integers. The first integer corresponds to the number of rows/columns in the matrix. The remaining integers correspond to the elements in the matrix. The elements are read in rowwise order, first row first, then second row and so on. Assume that the maximum value of m and n is 5.



Output Format:

Print yes if it is a diagonal matrix. Print no if it is not a diagonal matrix.

 

Sample Input :

2

4 5

5 4



Sample Output:

no


*/

public class Q6 {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int p=0;
			int arr[][]=new int[n][n];
			for(int i=0; i<n;i++) {
				for(int j=0;j<n;j++)
				{
					arr[i][j]=sc.nextInt();
				}
			}
			for(int i=0; i<n;i++) {
				for(int j=0;j<n;j++) {
					if(i!=j && arr[i][j]==0)
					{
						p++;
						break;
					}
					if(i==j)
					{
						continue;
					}
				}
			}
			int res=(n*n)-n;
			if(res==p)
				System.out.println("yes");
			else
				System.out.println("no");
				
			
			
	}

}
