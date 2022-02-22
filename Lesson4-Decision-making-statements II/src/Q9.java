import java.util.Scanner;

/*Microwave Oven
A microwave oven manufacturer recommends that when heating two items, add 50% to the heating time, and when heating three items double the heating time. Heating more than three items at once is not recommended. Write a program to find out the recommended heating time.
Input format:

The first input containing an integer which denotes the number of items

The second input containing the floating point number which denotes the single item heating time.



Output format:

Print the recommended heating time in floating point with 2 decimal places.

If the number of items is more than three, print "Number of items is more" 



Sample Input:

2

5.0



Sample Output:

7.50
*/

public class Q9 {
static void heat(int items, float heattime)
{
	if(items<2)
		System.out.println(0.0);
	else if(items==2)
		System.out.println(heattime+(0.5*heattime));
	else if(items==3)
		System.out.println(heattime*2);
	else
		System.out.println("Number of items is more");
		
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int items=sc.nextInt();
		float heattime=sc.nextFloat();
		heat(items,heattime);
	}
}
		

