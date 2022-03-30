package Day4;

public class Bike {
	void run()
	{
		System.out.println("Bike is running");
	}
class Honda extends Bike
{
	void run()
	{
		System.out.println("Honda is running");
	}
}
class methodOverriding1{


	public static void main(String[] args) {
		Bike obj =new Bike();
		obj.run();
	}

	}

}
