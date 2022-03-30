package Day4Assignment;

class Parentdemo{
	void car() {
		System.out.println("BMW");
	}
	
	
}
class A1 extends Parentdemo{
	void bike() {
		System.out.println("Bullet");
	}

		
	}
	

class B1 extends Parentdemo{
	void cycle(){
		System.out.println("Atlas");
	}
	
}
public class Hierarchical {

	public static void main(String[] args) {
		A1 obj = new A1();
		obj.car();
		obj.bike();
		B1 obj1 = new B1();
		obj1.car();
		obj1.cycle();
		
		
		
		

	}

}
