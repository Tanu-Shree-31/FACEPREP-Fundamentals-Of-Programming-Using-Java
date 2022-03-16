import java.util.Scanner;

/*Series XII
Write a program to generate the following series 9, 11, 20, 31,..., 82
Input format:

The input containing an integer which denotes 'n'



Output format:

Print the series and refer the sample output for formatting



Sample Input:

6



Sample Output:

9 11 20 31 51 82
*/

public class Q12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=9,sum=11;
		System.out.print(num+" "+sum+" ");
		for(int i=1; i<n-1; i++)
		{
			int add=num+sum;
			num=sum;
			sum=add;
			
			System.out.print(add+" ");
		}
	}

}
