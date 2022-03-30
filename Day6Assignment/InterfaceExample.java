package Day6Assignment;

interface WaterBottle{
	String color = "black";
	void fillUp();
	void pourOut();
}
public class InterfaceExample implements WaterBottle {

	public static void main(String[] args) {
		System.out.println(color);
		InterfaceExample obj=new InterfaceExample();
		obj.fillUp();
        obj.pourOut();
	}

	@Override
	public void fillUp() {
       System.out.println("It is filled with  water");		
	}

	@Override
	public void pourOut() {
      System.out.println(" pourout the water into waterbottle");		
	}

}
