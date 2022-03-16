/*Viva on Odd Numbers
A maths teacher asks her students to give 3 examples for positive odd numbers. When the student specifies a correct answer, his/her score is incremented by 1. When the student specifies a positive even number, his/her score is decremented by 0.5. When the student specifies a negative number, he/she will not be given any more chances to correct his or her mistake and his/her score will be decremented by 1. So a student's turn comes to an end when he/she has correctly specified 3 positive odd numbers or when the student has specified a negative number. Few students didn't know the difference between odd numbers and even numbers and they made many mistakes and so it was difficult for the teacher to maintain the scores. The teacher asks for your help. Can you please help her by writing a program to calculate the score?
Input Format:

Input consists of a list of integers.



Output Format:

Output consists of a single line. The score needs to be displayed correct to 1 decimal place. Refer sample output for details.

[For this exercise, don't worry about duplicate odd numbers. Even if the students specifies the same odd number thrice, it is accepted].



Sample Input 1:

1

3

5



Sample Output 1:

3.0
*/
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		 float mark=0;

	        int count=0;

	        int n=0;

	        Scanner scan=new Scanner(System.in);

	        //n=scan.nextInt();

	        while(n>=0){

	            if(count==3)

	            {

	                break;

	            }

	            n=scan.nextInt();

	            if(n%2!=0 && n>=0)

	            {

	                ++mark;

	                ++count;    

	            }

	          else if(n<0)

	          {

	              mark=(float)(mark-1);

	           }

	          else

	           {

	              mark=(float)(mark-0.5);

	           }

	        }

	        System.out.printf("%.1f",mark);

	        //System.out.println(count);   

	    }


	}


