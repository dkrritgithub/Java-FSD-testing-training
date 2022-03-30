package Day3;

import java.util.Scanner;

public class SmallestNum {

	public static void main(String[] args) {
     int a,b,c,d;
     Scanner sc=new Scanner(System.in);
     a=sc.nextInt();
     b=sc.nextInt();
     c=sc.nextInt();
    d = c<(a<b?a:b)?c:((a<b)?a:b);
     System.out.println(" Smallest Number:" +d);
	}

}
