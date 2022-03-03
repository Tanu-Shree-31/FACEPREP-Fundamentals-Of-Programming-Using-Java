import java.util.Scanner;

/*Array deletion
Given an array with 'n' elements, Suresh wants to delete an element at a particular position in the array. Help him in deleting the element and displaying the updated array.
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



Sample Output:

Array after deletion is

1

2

3

5
*/

public class Q10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int pos=sc.nextInt();
		if(pos>n)
			System.out.println("Invalid Input");
		else
		{
			System.out.println("Array after deletion is");
			i=0;
			while(i<n)
			{
				if(i!=pos-1)
					System.out.printf("%d\n",arr[i]);
				i++;	
			}
		

	}

}
}
