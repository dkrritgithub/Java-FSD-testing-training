package Day16;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
           int i,j,k,swap;
           Scanner sc=new Scanner(System.in);
           System.out.println("Input number of integers to sort");
           i=sc.nextInt();
           int array[] = new int[i];
           System.out.println("Enter "+ i +" integers");
           for (j=0; j<i; j++)
        	   array[j] = sc.nextInt();
           for(j=0;j<(i-1);j++) {
        	   for(k=0;k<i-j-1;k++) {
        		   swap     = array[k];
        		   array[k] = array[k+1];
        		   array[k+1] = swap;
        	   }
           }
           System.out.println("Sorted list of numbers");
           for(j=0; j<i; j++)
        	   System.out.println(array[j]);
	}
	
}
