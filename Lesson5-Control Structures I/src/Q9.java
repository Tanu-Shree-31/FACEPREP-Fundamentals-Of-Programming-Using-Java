import java.util.Scanner;

/*Data Mining
In the University Examinations conducted during the past 5 years, the toppers registration numbers were 7126, 82417914, 7687 and 6657. Your father is an expert in data mining and he could easily infer a pattern in the toppers registration numbers. In all the registration numbers listed here, the sum of the odd digits is equal to the sum of the even digits in the number. He termed the numbers that satisfy this property as Probable Topper Numbers. Write a program to find whether a given number is a probable topper number or not.
Input Format:

Input consists of a single integer.



Output Format:

Output consists of a single line. Refer sample output for details.



Sample Input:

143



Sample Output:

yes


*/
public class Q9 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int even_sum=0,odd_sum=0;
	      int n = sc.nextInt();
	      while(n!=0) {
	    	  int rem=n%10;
	    	  if(rem%2==0) {
	    		  even_sum+=rem;
	    	  }
	    	  else {
	    		  odd_sum+=rem;
	    	  }
	    	  n=n/10;	  
	      }
	      if(even_sum==odd_sum) 
	    	  System.out.println("yes");
	      else
	    	  System.out.println("No");
	}

}
