package Day3;

import java.util.Scanner;

public class AllPrime {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
		System.out.println("Enter a maximum number");
		int max,i;
		max = sc.nextInt();
		for(i = 2; i <= max; i++) {
			int count = 0;
			for(int j = 2;j<i;j++) {
			if(i % j == 0) {
				count++;
			
			}
		}
		if(count==0)
			System.out.println(i);
	}

}
}
