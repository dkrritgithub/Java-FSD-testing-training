package Day4;

public class Shape {
	void draw()
	{
		System.out.println("any shape can be drawn");
	}

}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Circle shape can be drawn");
	}
}
class Triangle extends Shape
{
	void draw()
	{
	System.out.println("Triangle shape can be drawn ");
}
}
class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Rectangle shape can be drawn");
	}
}
