/*Hotel Tariff Calculator
Write a program to calculate the hotel tariff. The room rent is 20% high during peak seasons [April-June, 
November-December].  Note: Use the switch construct.

Input format:
The first input containing an integer which denotes the number of the month
The second input containing the floating point number which denotes the room rent per day
The third input containing an integer which denotes the number of days stayed in the hotel

Output format:
Print the hotel tariff to be paid in floating point with 2 decimal places
Refer the sample output for formatting
*/
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double total=0;
		int month=sc.nextInt();
		float rent=sc.nextFloat();
		int days=sc.nextInt();
		switch(month) {
			case 4:
			case 5:
			case 6:
			case 11:
			case 12:
				total=days*(rent+(0.2*rent));
				System.out.println(total);
				break;
			case 1:
			case 2:
			case 3:
			case 7:
			case 8:
			case 9:
			case 10:
				total=days*rent;
				System.out.println(total);
				break;
			default:
				System.out.println("Invalid Input");
					
		}
	}

}
