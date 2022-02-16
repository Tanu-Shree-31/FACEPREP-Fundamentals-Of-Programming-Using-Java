import java.util.Scanner;

/*3 idiots
Ajay, Binoy, and Chandru were very close friends at school. They were very good in Mathematics and they 
were the pet students of Emily Mam. Their gang was known as 3-idiots. Ajay, Binoy, and Chandru live in 
the same locality. A new student Dinesh joins their class and he wanted to be friends with them. He asked 
Binoy about his house address. Binoy wanted to test Dinesh's mathematical skills. Binoy told Dinesh that 
his house is at the midpoint of the line joining Ajay's house and Chandru's house. Dinesh was puzzled. 
Can you help Dinesh out? Given the coordinates of the 2 endpoints of a line (x1,y1) and (x2,y2), write a  
program to find the midpoint of the line.

Input Format:
Input consists of 4 integers.
The first integer corresponds to x1 .
The second integer corresponds to y1.
The third integer corresponds to x2.
The fourth integer corresponds to y2.

Output Format:
Refer Sample Input and Output for exact formatting specifications.
[All floating point values are displayed correct to 1 decimal place]
*/

public class Q12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		double xmid=(x1+x2)/2.0;
		double ymid=(y1+y2)/2.0;
		System.out.println("Binoy's house is located at ("+xmid+","+ymid+")");

	}

}
