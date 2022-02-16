import java.util.Scanner;
import java.lang.Math;
/*Power of a Number
pow() function is used to calculate the power of any base and it is defined in java.lang.Math package. 
Write a program to read X as the base and N as the power and calculate the result (X^N - X to the power of N).

Input format:
The first line containing integer denotes the base(X)
The second line containing integer denotes the power(N)

Output format:
Print the power of a number
*/

public class Q8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int base=sc.nextInt();
		int power=sc.nextInt();
		System.out.printf("%.0f",Math.pow(base,power));

	}

}
