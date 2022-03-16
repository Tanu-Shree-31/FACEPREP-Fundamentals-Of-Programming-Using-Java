/*Series XV
Write a program to generate the following series 3, 8, 13, 24, 41, 70, 117, 194,.......
Input format:

The input containing an integer which denotes 'n'



Output format:

Print the series. Refer the sample output for formatting



Sample Input:

6



Sample Output:

3 8 13 24 41 70
*/

public class Q15 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

        int n=s.nextInt();

        int i;

        int sum=8,t,f=3;

        for(i=1;i<=n;i++)

        {

            if(i==1)

            {

            System.out.print("3 ");

            }

            else

            {

                System.out.print(sum+" "); 

            t=f+(sum+i);

            f=sum;

            sum=t;   

            }            

        }

	}

}
