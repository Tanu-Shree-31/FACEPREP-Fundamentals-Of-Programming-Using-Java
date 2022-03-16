/*Amoeba Multiplication
The environmental eco-club has discovered a new Amoeba that grows in the order of a Fibonacci series every month. 
They are exhibiting their amoeba in a national conference. They want to know the size of the amoeba at a particular 
time instant. If a particular month’s index is given, write a program to displays the amoeba’s size……??? 
For Example, The size of the amoeba on month 1, 2, 3, 4, 5, 6, ..will be 0, 1, 1, 2, 3, 5, 8 respectively.
*/
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		int j=0,k=1,res=0;
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		for(int i=1;i<(month-1);i++)
		{
			res=j+k;
			j=k;
			k=res;
		}
		System.out.println(res);
	}
}
