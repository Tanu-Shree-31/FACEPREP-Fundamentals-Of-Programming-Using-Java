import java.util.Scanner;

/*Array insertion
Arun and Ram were playing cards. Arun has 5 cards. Ram wants to insert a new card in between Arun's cards. Ram wants to find the position to insert the card. So help him to find the position to insert a certain card. If Ram inserts a card in a position other than the position of 5 cards, the game will be over. So play carefully. EXAMPLE: consider an array having three elements in it initially and a[0] = 1, a[1] = 2 and a[2] = 3 and you want to insert a number 45 at location 1 i.e. a[0] = 45, so we have to move elements one step below after insertion a[1] = 1 , and a[2] = 2 and a[3] = 3.
Input Format:

Assume that the maximum number of elements in the array is 20.



Output Format:

Refer to the sample input and output for formatting specifications.



Sample Input:

5

1

2

3

4

5

4

10



Sample Output:

Array after insertion is

1

2

3

10

4

5
*/

public class Q9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		int n=sc.nextInt();
		int arr[]=new int[n+1];
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int index=sc.nextInt();
		if(index>n || index<0) {
			System.out.println("Invalid Input");
		}
		else {
			i=0;
			int ele=sc.nextInt();
			while(i<n)
			{
				if(i==index-1)
					System.out.printf("%d\n%d\n",ele,arr[i]);
				else

	            {

	                System.out.printf("%d\n", arr[i]);

	            }

	            i=i+1;
			}
		}
		
	}

}
