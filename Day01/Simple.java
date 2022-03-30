package Day01;

import java.util.Scanner;

public class Simple {

	public static void main(String[] args) {
    double a;
	double b;
	double avg;
	double c;
      Scanner s=new Scanner(System.in);
      System.out.println("Enter three values");
      a=s.nextDouble();
      b=s.nextDouble();
      c=s.nextDouble();
      
      avg=(a+b+c)/3;
      System.out.println("Print the average value of 3 numbers"+avg);
      
	}

}
