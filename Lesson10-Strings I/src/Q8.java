import java.util.Scanner;

/*String - Lower case
Write a program to change the given string to lowercase using string library functions


Input Format:

Input consist of 1 string.



Sample Input:

FACE



Sample Output:

face
*/

public class Q8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char strarr[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(strarr[i]>='A' && strarr[i]<='Z')
			{
				strarr[i]=(char)((int)strarr[i]+32);
			}
		}
		for (int i = 0; i < strarr.length; i++) {
            System.out.print(strarr[i]);

			}
	}

}
