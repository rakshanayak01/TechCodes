package tech;
import java.util.Scanner;
public class FibSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		int fib1=0,fib2=1,fib3;
		for(int i=1;i<=n;i++)
		{
			System.out.println(fib1+"");
			fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3;
		}
	}
}
