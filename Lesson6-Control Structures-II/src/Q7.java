import java.util.Scanner;

/*Series VII
Write a program to generate the following series --- 1, 2.0, 3.0, 6.0, 9.0, 18.0, 27.0,...
Input format:

The input containing an integer which denotes 'n'



Output format:

Print the series and refer the sample output for formatting



Sample Input:

6



Sample Output:

1 2.0 3.0 6.0 9.0 18.0
*/

public class Q7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		float even=2,odd=1;
		for(int i=1; i<=n; i++)
		{
			if(i==1)
			{
				System.out.print("1 ");
				i++;
			}
			if(i%2==0)
			{
				System.out.print(even+" ");
				even=even*3;
			}
			else {
				odd=odd*3;
				System.out.printf(odd+" ");
			}
		}
	}

}
