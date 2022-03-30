package Day4Assignment;

public class Sample2 {
	void mul(int l,int b)
	{
		System.out.println("answer of multiplication is "+(l*b));
	}
	void mul(int l,int b,int h)
	{
		System.out.println("answer of multiplication is "+(l*b*h));
	}
    void mul(int l,int b,int h,int r)
    {
    	System.out.println("answer of multiplication is "+(l*b*h*r));
    }
	public static void main(String[] args) {
	Sample2 obj=new Sample2();
		obj.mul(10, 25);
		obj.mul(2, 32, 44);
		obj.mul(25, 22, 10, 13);
		

	}

}
