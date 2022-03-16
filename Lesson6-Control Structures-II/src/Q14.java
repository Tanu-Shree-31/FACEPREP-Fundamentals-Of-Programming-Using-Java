/*Series XIV
Write a program to generate the following series 2, 5, 11, 23, 47, 95, 191........... Input format: The input containing an integer which denotes 'n' Output format: Print the series and refer the sample output for formatting
*/

public class Q14 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);

	        int n=s.nextInt();

	        int i;

	        int sum=5,t,f=2;

	        for(i=1;i<=n;i++)

	        {

	            if(i==1)

	            {

	            System.out.print("2 ");

	            }

	            else

	            {

	                System.out.print(sum+" "); 

	            t=(f*sum)+1;           

	            sum=t;

	            }

	        }

	}

}
