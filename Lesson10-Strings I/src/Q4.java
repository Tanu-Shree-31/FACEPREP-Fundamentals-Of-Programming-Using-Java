import java.util.Scanner;

/*String - Copy
Write a program to copy a string from one variable to other using string library functions:


Input Format:

Input consist of 1 string.



Sample Input:

hello



Sample & Output:

hello
*/

public class Q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=s.valueOf(s);
		System.out.println(s1);
	}

}
