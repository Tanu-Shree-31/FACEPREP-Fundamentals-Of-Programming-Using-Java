import java.util.Scanner;

/*String - Reverse
Write a program to find the reverse of the given without string using string library functions:


Input Format:

Input consist of 1 string.



Sample Input:

hello



Sample & Output:

olleh
*/
import java.util.Scanner;
public class Q5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
	}

}
