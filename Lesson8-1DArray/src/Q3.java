import java.util.Scanner;

/*Compatible array
Write a program to find whether 2 arrays are compatible or not. Two arrays are said to be compatible if they 
are of the same size and if the ith element in the first array is greater than or equal to the ith element 
in the second array for all the values of i.

INPUT FORMAT:
Input consists of 2n+1 integers. 
The first integer corresponds to ‘n’, the size of the array. 
The next ‘n’ integers correspond to the elements in the first array. 
The last 'n' integers correspond to the elements in the second array. 
Assume that the maximum value of n is 15.


OUTPUT FORMAT:
Refer sample output for details.
*/

public class Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=0;
		int n=sc.nextInt();
		if(n<=15) 
		{
			int array1[]=new int[n];
			int array2[]=new int[n];
			for(int i=0; i<n; i++)
			{
				array1[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				array2[i]=sc.nextInt();
			}
			if(array1.length==array2.length)
			{
				for(int i=0;i<n;i++)
				{
					if(array1[i]>=array2[i])
						c=0;
					else
						c=1;
				}
			}
			if(c==0)
				System.out.println("Compatible");
			else
				System.out.println("Incompatible");	
		}
	}
}
