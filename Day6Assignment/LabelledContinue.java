package Day6Assignment;

public class LabelledContinue {

	public static void main(String[] args) {
	outer:
	for(int i=1;i<5;i++) {
	 for(int j=1;j<5;j++) {
		if(i==j) {	  
      System.out.print(" "); 
      continue outer;
		}
    	  System.out.print(j+" ");
	 }
	 System.out.println();
      }
	}
}
	
	


