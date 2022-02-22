import java.util.Scanner;

/*String - Concatenate
There were two best friends. They had a fight between them and they were not talked with each other. Help those two peoples to join again and let them enjoyed. Find the concatenation of given two strings using string library functions:


Input Format:

Input consist of 2 string.



Sample Input:

Face

Academy



Sample Output:

FaceAcademy

*/

public class Q11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		System.out.println(s1.concat(s2));

	}

}
