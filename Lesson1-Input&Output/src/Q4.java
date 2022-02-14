/*Two commonly used functions for I/O (Input/Output) are System.out.println() and System.in(). Write a program to get a character as input and print it. The Scanner class reads formatted input from the keyboard. When the user enters a character, it is stored in the variable test character.
*/
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(s);
	}

}
