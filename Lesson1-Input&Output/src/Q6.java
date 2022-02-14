import java.util.Scanner;

/*Write a program to get float as input and print it. The Scanner class reads formatted input from the keyboard. 
 * When the user enters the float value, it is stored in variable testFloat. Use '%.2f' in the System.out.printf() 
 * to display float value with 2 precisions.
 * 
 */
public class Q6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float testFloat=sc.nextFloat();
		System.out.printf("%.2f",testFloat);

	}

}
