package Day3;

import java.util.Scanner;

public class TernaryGreatestNum {

	public static void main(String[] args) {
       int a,b,c,d;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter all the three numbers:");
       a = sc.nextInt();
       b = sc.nextInt();
       c = sc.nextInt();
       d = c>(a>b?a:b)?c:((a>b) ? a:b);
       System.out.println("Largest Number:"+d);
       
	}

}
