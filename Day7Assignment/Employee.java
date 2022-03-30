package Day7Assignment;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter name of the employee");
       String name=sc.next();
       System.out.println("Enter salary");
       int salary=sc.nextInt();
       System.out.println("Enter year of joining");
       int year=sc.nextInt();
       System.out.println(name+"salary is"+salary+" and the year of joining"+year);
	}

}
