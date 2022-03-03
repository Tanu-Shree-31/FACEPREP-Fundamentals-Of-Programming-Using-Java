/*Maximum Element in an Array
You are playing the PUBG game and you entered into the Bootcamp. There you viewed the drop box which was 
filled with guns. you have to choose the biggest gun in the drop box. Find the biggest gun and you will get 
the chicken dinner.

Input Format:
Input consists of n+1 integers.
The first integer corresponds to ‘n’ , the size of the array.
The next ‘n’ integers correspond to the elements in the array. Assume that the maximum value of n is 15.

Output Format:
Refer sample output for details.
*/
import java.util.Scanner;
import java.util.Arrays;
public class Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int array[]=new int[n];
		if(n<=15)
		{
			for(int i=0; i<n;i++)
			{
				array[i]=sc.nextInt();
			}
		}
		int max=Arrays.stream(array).max().getAsInt();
		System.out.println(max+" is the maximum element in the array");
	}

}
