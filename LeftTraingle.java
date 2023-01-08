package tech;
import java.util.Scanner;
public class LeftTraingle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int len=str.length();
		for(int i=1;i<=len;i++)
			System.out.printf("%-"+len+"."+i+"s\n",str);
	}
}
