import java.util.Scanner;

/*String - Upper case
Write a program to change the given string to uppercase without using string library functions


Input Format:

Input consist of 1 string.



Sample Input:

good



Sample Output:

GOOD
*/

public class Q7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char strarr[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(strarr[i]>='a' && strarr[i]<='z')
			{
				strarr[i]=(char)((int)strarr[i]-32);
			}
		}
		for (int i = 0; i < strarr.length; i++) {
            System.out.print(strarr[i]);

			}

}
}
