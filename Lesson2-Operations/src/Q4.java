import java.util.Scanner;

/*Swapping two numbers without third variable
Write a java program to swap two values without using the 3rd variable.

Input format:
First input: an integer
Second input: an integer

Output format:
The output will be integers(swapped values)
*/
public class Q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);

	}

}
