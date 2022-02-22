import java.util.Scanner;

/*String - Palindrome
Write a program to find whether the given string is palindrome or not without using string library functions:


Input Format:

Input consist of 1 string.



Output Format:

If the given string is a Palindrome display “Palindrome”, else display “Not a Palindrome”.





Sample Input:

computer



Sample Output:

Not a Palindrome
*/
public class Q9 {
static boolean palindrome(String s,int i,int j)
{
	while(i<j)
	{
		if(s.charAt(i)!=s.charAt(j))
			return false;
		i++;
		j--;
	}
	return true;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int i=0,j=s.length()-1;
		boolean res=palindrome(s,i,j);
		if(res==true)
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not a Palindrome");
	}

}
