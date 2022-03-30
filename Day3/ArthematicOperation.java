package Day3;

import java.util.Scanner;

public class ArthematicOperation {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter any positive integers");
       int a = sc.nextInt();
       int b = sc.nextInt();
       int sum,div,mul,sub,mod;
       sum = a+b;
       div = a/b;
       mul = a*b;
       sub = a-b;
       mod = a%b;
       System.out.println(sum);
       System.out.println(div);
       System.out.println(mul);
       System.out.println(sub);
       System.out.println(mod);
       
	}

}
