import java.util.Scanner;

/*Unicode Values-I
Write a program to get a character as input and print its Unicode value. When a character is entered, the 
character itself is not stored. Instead, a numeric value(Unicode value) is stored.
*/
public class Q8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char s=sc.next().charAt(0);
		System.out.print((int)s);
	}

}
