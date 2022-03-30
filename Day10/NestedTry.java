package Day10;

import java.text.NumberFormat;
import java.util.Scanner;

public class NestedTry {

	public static void main(String[] args) {
          try {
              try {
            	  Scanner sc=new Scanner(System.in);
            	  System.out.println("Enter the values");
            	  int num1=sc.nextInt();
            	  int num2=Integer.parseInt(sc.next());
            	  int result=num1/num2;
            	  System.out.println(result);
            			  
              }
              catch(NumberFormatException e) {
            	  System.out.println(e);
              }
              String a=null;
              System.out.println(a.length());
          }
          catch(NullPointerException e) {
        	  
          }
	}
}