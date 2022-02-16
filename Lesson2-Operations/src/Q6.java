import java.util.Scanner;

/*Area Calculation
Sheela has three things in her bag. She wants to compute the area of 3 things but 3 things are in 
different shapes. The three things are in a square shape, rectangular shape, and circular shape 
respectively.  Write a program to help Sheela to calculate the area of different shapes.

Input format:
First input: a side of a square in integer
Second input: length of a rectangle in integer
Third input: breadth of a rectangle in integer
Fourth input: radius of a circle in float

Output format:
The first output should be the area of a square in integer
The second output should be the area of a rectangle in integer
The third output should be the area of a circle in float with 2 decimal places
*/

public class Q6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int side=sc.nextInt();
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		float radius=sc.nextFloat();
      	double e=(3.14*radius*radius)*100;
		System.out.println(side*side);
		System.out.println(length*breadth);
		System.out.printf("%.02f",Math.floor(e)*0.01);

	}

}
