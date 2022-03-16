/*Series IX
Write a program to generate the following series 2, 15, 41, 80,...
Input format:

The input containing an integer which denotes 'n'



Output format:

Print the series and refer the sample output for formatting.



Sample Input:

5



Sample Output:

2 15 41 80 132
*/
import java.util.*;
public class Q9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		    int sum=2;

		    int i;

		    for(i=0;i<n;i++)

		    {

		        sum=sum+(13*i);

		        System.out.print(sum+" ");

		    }

	}

}
