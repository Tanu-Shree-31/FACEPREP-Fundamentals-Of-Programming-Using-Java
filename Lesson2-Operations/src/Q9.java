import java.util.Scanner;

/*Ternary Operator
The conditional operator is also known as ternary operator [exp? true: false] can be used to make an 
either-or choice.  Write a program to get a number from the user and find out whether it is odd or even.

Input format:
The input containing integer denotes the given number 

Output format:
If given number is even, print "Even". Otherwise, print "Odd".
*/

public class Q9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String res=n%2==0 ? "Even" : "Odd";
		System.out.println(res);

	}

}
