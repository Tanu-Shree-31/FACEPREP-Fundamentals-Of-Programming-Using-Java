import java.util.Scanner;
public class Q7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int minimum=0;
		int l1capacity=sc.nextInt();
		int l2capacity=sc.nextInt();
		int l3capacity=sc.nextInt();
		if(l1capacity<l2capacity)
		{
			if(l1capacity<l3capacity)
				System.out.println("L1");
		}
		else {
			if(l2capacity<l3capacity) {
				System.out.println("L2");
			}
			else {
				System.out.println("L3");
			}
		}
	}
}
