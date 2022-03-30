package Day13;

import java.util.ArrayList;

public class AverageSum {

	public static void main(String[] args) {
      ArrayList<Integer> sum=new ArrayList<Integer>();
      sum.add(10);
      sum.add(15);
      sum.add(20);
      int total=0;
      int avg;
      for(int i=0;i<sum.size();i++)
      {
    	  total+=sum.get(i);
    	  avg=total/sum.size();
    	  System.out.println("The Average Is:"+avg);
      }
	}

}
