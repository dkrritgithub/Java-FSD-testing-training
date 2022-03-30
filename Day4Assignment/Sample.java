package Day4Assignment;

public class Sample {
	   void mul(double d,double e)
	   {
		   System.out.println("Multiplication is "+(d*e));
		   	
	   }
	   void mul(float l,int b,float h)
	   {
		   System.out.println("answer of these multiplication is"+(l*b*h));
		   
	   }
	   void mul(int l,int b)
	   {
		   System.out.println("answer of these multiplication is"+(l*b));
		   
	   }
	   void mul(float l,float b)
	   {
		   System.out.println("answer of these multiplication is"+(l*b)); 
	   }
	   

	public static void main(String[] args) {
    Sample obj = new Sample();
    obj.mul(5.5,4.2);
    obj.mul(0.2, 0.4);
    obj.mul(3.3, 5);
    obj.mul(6, 6);
    }
	

}
