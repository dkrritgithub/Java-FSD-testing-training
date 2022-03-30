package Day7Assignment;

import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
      
		int number[],size,greatest;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of an array:");
			size=sc.nextInt();
			number=new int[size];
			System.out.println("Enter elements of an array:");
			for(int i=0;i<number.length;i++) {
				number[i]=sc.nextInt();
			}
			greatest=number[0];
			for(int i=1;i<number.length;i++)
			{
				if(greatest<number[i])
				{
					greatest=number[i];
				}
			}
			System.out.println("greatest value is:" +greatest);
	}
	

}
