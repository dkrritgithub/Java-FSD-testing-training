package Day8Assignment;

public class Palindrome {

	public static void main(String[] args) {
      String a="MOM";
      String reverse="";
      for(int i=a.length()-1;i>=0;i--) {
    	  reverse += a.charAt(i);
    	  System.out.println(reverse);
      }
	}

}
