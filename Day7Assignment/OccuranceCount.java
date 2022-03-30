package Day7Assignment;

import java.util.Scanner;

public class OccuranceCount {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int[] keepCounting=new int[100];
     System.out.println("Enter number between 1 and 100");
     int numbers=sc.nextInt();
     while(numbers !=0) {
    	 keepCounting[numbers]++;
    	 numbers=sc.nextInt();
     }
     for(int i=0;i<keepCounting.length;i++) {
    	 if(keepCounting[i]!=0) { 
    		 System.out.println((i+1)+" occur " + keepCounting[i] + (keepCounting[1] > 1? "times" :"time"));
    	 }
     }
	}

}
