import java.util.Scanner;

/*Checking alphabets
Write a program to check whether the given character is vowel or consonant

Input format:
The input consist of a character

Output format:
The output consists of a below-given string 
“Vowel” / “Consonant” / “Not an alphabet”

Sample Input:
e

Sample Output:
Vowel
*/
import java.lang.*;
public class Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
		{
			ch=Character.toLowerCase(ch);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				System.out.println("Vowel");
			else
				System.out.println("Consonant");
		}
		else
		{
			System.out.println("Not an alphabet");
		}
		
		
	}

}
