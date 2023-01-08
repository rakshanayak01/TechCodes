package tech2;
import java.util.Scanner;
public class Consonant {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s = sc.next();
		char str[] = s.toCharArray();
		int len = s.length();
		for(int i = 0; i < len; i++) {
			if(str[i] == 'd')
				str[i] = 'n';
			else if(str[i] == 'c')
				str[i] = 't';
			else if(str[i] == 't')
				str[i] = 'c';
			else if(str[i] == 'n')
				str[i] = 'd';
		}
		System.out.println(new String(str));
		}
}
