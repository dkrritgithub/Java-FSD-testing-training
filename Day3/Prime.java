package Day3;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number");
      int num,i,count = 0;
      num = sc.nextInt();
    		  for(i=2;i<num;i++) {
    			  count++;
    			  break;
    		  }
    			  
	if(count == 0)
		System.out.println("number is prime");
	else
		System.out.println("Number is not a pime");
}
}
		 
      