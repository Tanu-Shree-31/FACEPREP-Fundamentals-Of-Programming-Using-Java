/*Fee collection
Write a program to determine the fee amount to be collected from a student.  Refer the table below for fee 
details. Student Type Student Type denoted as Fee Details   Merit Seat Day Scholar MSDS Tuition fee + Bus 
fee Merit Seat Hosteller MSH Tuition fee + Hostel fee Management Seat Day Scholar MGSDS 150% of Tuition fee + 
Bus fee Management Seat Hosteller MGSH 150% of Tuition fee + Hostel fee

Input format:
The first input corresponds to the student type
The second input corresponds to the tuition fee
The third input corresponds to the bus fee
The fourth input corresponds to the hostel fees

Output format:
Print the total fee amount of the corresponding student with 2 decimal places. 
Refer below sample output for formatting

Sample Input:
MSH
40000
12000
50000

Sample Output:
90000.00
*/

import java.util.*;
public class Q5 {

	public static void main(String args[])

    {
      Scanner s = new Scanner(System.in);
      String t = s.next();
      int f = s.nextInt();
      int b = s.nextInt();
      int h = s.nextInt();
      double a = f+b;
      double c = f+h;
      double d = (((f/100)*150)+b);
      double e = (((f/100)*150)+h);
      switch(t){
        case "MSDS":
          System.out.printf("%.2f",a);
          break;
        case "MSH":
          System.out.printf("%.2f",c);
          break;
        case "MGSDS":
          System.out.printf("%.2f",d);
          break;
        case "MGSH":
          System.out.printf("%.2f",e);
          break;
        default:
          System.out.printf("Invalid");
      }
    }
}