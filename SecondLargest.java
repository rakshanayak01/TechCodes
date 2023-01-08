package tech;
import java.util.Scanner;
public class SecondLargest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num of elements");
		int n=sc.nextInt();
		int max1=Integer.MIN_VALUE;
		int max2=sc.nextInt();
		for(int i=1;i<=n-1;i++)
		{
			int x=sc.nextInt();
			if(x>max1)
			{
				max2=max1;
				max1=x;
			}
			else if(x>max2)
				max2=x;
			else
				break;
		}
		System.out.println(max2);
	}
}
