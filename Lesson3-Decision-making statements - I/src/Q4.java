import java.util.Scanner;

/*Profit or loss
A fruit seller buys a dozen of banana at Rs.X. He sells 1 banana at Rs.Y. Write a program to determine the 
profit or loss in Rs. for the fruitseller.

Input format:
Input consists of 2 floating point numbers
The first input corresponds to the total cost(X)
The second input corresponds to the sold cost(Y)

Output format:
Print "Profit or Loss" with Rupees.

Sample Input:
60
4

Sample Output:
Loss : Rs.12.00
*/

public class Q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float total_cost=sc.nextFloat();
		float sold_cost=sc.nextFloat();
		if (total_cost>(sold_cost*12))
			System.out.printf("Loss : Rs.%.2f",(total_cost-(sold_cost*12)));
		else if (total_cost<(sold_cost*12))
			System.out.printf("Profit : Rs.%.2f",(total_cost-(sold_cost*12)));
		else
			System.out.println("No profit nor loss");
	}

}
