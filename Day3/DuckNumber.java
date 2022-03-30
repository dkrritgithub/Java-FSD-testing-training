package Day3;

import java.util.Scanner;

public class DuckNumber {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Input a number:");
     String str=sc.nextLine();
     int l = str.length();
     int ctr=0;
     char chr;
     for(int i=1;i<l;i++)
     {
    	 chr = str.charAt(i);
    	 if(chr=='0')
    		 ctr++;
     }
     char f = str.charAt(0);
     if(ctr>0 && f!='0')
    	 System.out.println("Duck number");
     else
    	 System.out.println("Not a duck number");
	}

}
