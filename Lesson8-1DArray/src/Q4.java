/*Search an element
Arun's teacher gave him the following challenge. Help him solve it. "Given an array with 'n' elements by 
a user, you need to search if a particular element is present in the array or not. The element to be 
searched for is also given by the user"

Input Format:
Input consists of n+2 integers. 
The first integer corresponds to ‘n’, the size of the array. 
The next ‘n’ integers correspond to the elements in the array. 
The last integer corresponds to ‘a’, the element to be searched.

Output Format:
Refer to sample output for details.
*/

import java.util.Arrays;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int a=sc.nextInt();
		Arrays.sort(arr);
		int res=Arrays.binarySearch(arr, a);
		if(res>0)
			System.out.println(a+" is present in the array");
		else
			System.out.println(a+" is not present in the array");
		
		
	}

}
