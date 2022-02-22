/*String - Compare
Write a program to find whether the given two strings are same or not using string library functions:


Input Format:

Input consist of 2 string.



Output Format:

If two strings are same display “Strings are same”,else display “Strings are not same”.



Sample Input:

hello



Sample & Output:

hello
*/
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		if(s1.equalsIgnoreCase(s2))
			System.out.println("Strings are same");
		else
			System.out.println("Strings are not same");
		

	}

}
