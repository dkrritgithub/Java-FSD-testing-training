package Day16;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
       int size,i,j,temp;
       int arr[]=new int[50];
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of array");
       size = sc.nextInt();
       System.out.println("Enter the else statement of array");
       for(i=0; i<size; i++)
       {
    	   arr[i]=sc.nextInt();
       }
       System.out.println("performing selection sort");
       for(i=0; i<size; i++)
       {
    	   for(j=i+1; j<size; j++) {
    		   if(arr[i] > arr[j])
    		   {
    			   temp = arr[i];
    			   arr[i] = arr[j];
    			   arr[j] = temp;
    			   
    		   }
    	   }
       }
       System.out.println("The sorted list is");
       for(i=0; i<size; i++)
       {
    	   
    	   System.out.println(arr[i]+ " ");
       }
	}

}
