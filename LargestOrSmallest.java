package tech;
import java.util.Scanner;
public class high_low_wt_array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int largest=Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;
		System.out.printf("enter %d numbers ",n);
		for(int i=0;i<n;i++)
		{
			int current=sc.nextInt();
			if(current>largest)
				largest=current;
			if(current<smallest)
				smallest=current;
		}
		System.out.println(largest);
		System.out.println(smallest);
	}
}
