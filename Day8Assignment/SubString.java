package Day8Assignment;
import java.util.*;
public class SubString {

	public static void main(String[] args) {
       String a,b;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the first String:");
       a = sc.nextLine();
       System.out.println("Enter the second String:");
       b = sc.nextLine();
       
       a = a.concat(b);
       System.out.println(" First string after concatenation:" +a);
	}

}
