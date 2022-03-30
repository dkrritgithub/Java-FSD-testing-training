package Day16;

import java.util.Arrays;
import java.util.Scanner;

public class Sorthing {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int tempValue;
       System.out.println("Enter number of array elements:");
       int size=sc.nextInt();
       int[] numArray = new int[size];
       for(int i=0;i<size;i++) {
    	   System.out.println("Enter elements:");
    	   numArray[i]=sc.nextInt();
       }
       System.out.println("you have entered:");
       for(int i=0;i<size-1;i++) {
    	   
       }
       System.out.println(numArray[numArray.length-1]);
       Arrays.sort(numArray);
       System.out.println("Final array after sorting:");
       for(int i=0;i<size-1;i++) {
    	   System.out.print(numArray[i]+",");
       }
       System.out.println(numArray[numArray.length-1]);
	}

}
