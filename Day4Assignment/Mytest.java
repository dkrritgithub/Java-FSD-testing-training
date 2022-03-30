package Day4Assignment;
class Parent{
	void bike() {
		System.out.println("Deo");
	}
	
}
class Child extends Parent{
	void Cycle() {
	System.out.println("Atlas");
	}
	
}

public class Mytest {

	public static void main(String[] args) {
		
   Child obj=new Child();
   obj.Cycle();
   obj.bike();
	}

}
