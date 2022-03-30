package Day4Assignment;
class A{
	void display() {
		System.out.println("Display the message");
	}
}
class B extends A{
	void display1() {
		System.out.println("Display message 1");
	}
}
class C extends B{
	void display2() {
		System.out.println("Display message 2");
	}
}

public class Mytest1 {
	 
	public static void main(String[] args) {
	C obj=new C();
	obj.display();
	obj.display1();
	obj.display2();
	

}
}
