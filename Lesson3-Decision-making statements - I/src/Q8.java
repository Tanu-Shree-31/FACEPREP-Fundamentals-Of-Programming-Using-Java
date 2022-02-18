import java.util.Scanner;

/*Lab Allocation II
There are 3 labs in the CSE department are L1, L2, and L3 with a seating capacity of x, y, and z respectively. 
One of the 3 labs has been allocated for FACE training. Out of the available labs, find the lab which has 
minimal seating capacity.

Input format:
Input consists of 3 integers and a string
The first input denotes the seating capacity of L1(x)
The second input denotes the seating capacity of L2(y)
The third input denotes the seating capacity of L3(z)
The fourth input denotes the lab which is allocated for FACE training

Output format:
Print the minimal seating capacity lab amongst the available labs.

Sample Input:
30
40
20
L3

Sample Output:
L1
*/

public class Q8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l1capacity=sc.nextInt();
		int l2capacity=sc.nextInt();
		int l3capacity=sc.nextInt();
		String allocated=sc.next();
		if(allocated.equals("L1"))
		{
			if(l2capacity<l3capacity)
				System.out.println("L2");
			else
				System.out.println("L3");
		}
		else if(allocated.equals("L2"))
		{
			if(l1capacity<l3capacity)
				System.out.println("L1");
			else
				System.out.println("L3");
		}
		else if(allocated.equals("L3"))
		{
			if(l1capacity<l2capacity)
				System.out.println("L1");
			else
				System.out.println("L2");
		}
	}

}
