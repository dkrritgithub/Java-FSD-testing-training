package Day8Assignment;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter the string");
         String s1=sc.next();
         System.out.println("Enter the number of Characters that we want to enter");
         int n=sc.nextInt();
         System.out.println("Enter the characters are");
         char a[]=new char[n];
         for(int i=0;i<n;i++) {
        	 a[i]=sc.next().charAt(0);
         }
         System.out.println("the entered characters are");
         for(int i=0;i<n;i++) {
        	 System.out.print(a[i]+" ,");
         }
         System.out.println(" ");
         for(int i=0;i<s1.length();i++) {
        	 char ch=s1.charAt(i);
        	 for(int j=0;j<n;j++) {
        		 if(a[j]==ch) {
        			 System.out.println("character "+a[j]    +s1);
        		 }
        	 }
         }
	}

}
