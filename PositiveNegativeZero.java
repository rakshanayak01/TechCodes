import java.util.Scanner;
class Check{
  public static void main( String args[] ) {
    static void checkNumber(int num){
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
        if(num>0)
            System.out.println(num + " is POSITIVE NUMBER.");
        else if(num<0)
            System.out.println(num + " is NEGATIVE NUMBER.");
        else
            System.out.println(num + " is a ZERO.");
    }
  }
