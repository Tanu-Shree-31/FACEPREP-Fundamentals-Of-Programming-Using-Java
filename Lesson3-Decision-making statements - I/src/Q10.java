import java.util.Scanner;

/*Lab Allocation IV
There are 3 labs in the CSE department. The labs are L1, L2, and L3 with a seating capacity of x, y, and z 
respectively. A single lab needs to be allocated to a class of 'n' students. The labs need to be utilized 
to the maximum i.e the number of systems used should not be minimal. Which lab needs to be allocated to this 
class?

Input format:
Input consists of 4 integers
The first input denotes 'x'
The second input denotes 'y'
The third input denotes 'z'
The fourth input denotes 'n'

Output format:
Print the lab which is suitable for 'n' number of students
Refer the Sample output for formatting

Sample Input:
30
40
20
25

Sample Output:
L1
*/

public class Q10 {

	public static void main(String[] args) {
		 int l1,l2,l3,n;

	        Scanner s=new Scanner(System.in);

	        l1=s.nextInt();

	        l2=s.nextInt();

	        l3=s.nextInt();

	        n=s.nextInt();

	        if(n<l1&&n<l2&&n<l3)

	        {

	            if(l1<l2&&l1<l3)

	            System.out.println("L1");

	            else if(l2<l3)

	            System.out.println("L2");

	            else

	            System.out.println("L3");

	        }

	        else if(n<l1&&n<l2)

	        {

	            if(l1<l2)

	            System.out.println("L1");

	            else

	            System.out.println("L2");

	        }

	        else if(n<l1&&n<l3)

	        {

	            if(l1<l3)

	            System.out.println("L1");

	            else

	            System.out.println("L3");

	        }

	        else if(n<l2&&n<l3)

	        {

	            if(l2<l3)

	            System.out.println("L2");

	            else

	            System.out.println("L3");

	        }

	        else if(n<l1)

	        System.out.println("L1");

	        else if(n<l2)

	        System.out.println("L2");

	        else if(n<l3)

	        System.out.println("L3");

	        else

	        System.out.println("0");
		
	}

}
