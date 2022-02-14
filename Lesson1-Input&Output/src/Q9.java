import java.util.Scanner;

/*Unicode Values-II
Write a program to get a number(Unicode values) as input and print its equivalent character. You can display 
a character if you know ASCII code of that character.
*/
public class Q9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println((char)n);
	}

}
