package InterfaceProgram;
interface Shape{
	public void area();
	public void perimeter();
}
class Square1 implements Shape{
	public void area() {
		System.out.println("Square area calculation.");
	}
	public void perimeter() {
		System.out.println("Square perimeter calculation.");
	}
}
class Circle1 implements Shape{
	public void area() {
		System.out.println("Circle area calculation.");
	}
	public void perimeter() {
		System.out.println("Circle perimeter calculation.");
	}
}
public class InterfaceExample1 {

	public static void main(String[] args) {
		Shape obj1 = new Square1();
		obj1.area();
		obj1.perimeter();
		Shape obj2 = new Circle1();
		obj2.area();
		obj2.perimeter();
		Circle1 cr = new Circle1();
		cr.area();
		cr.perimeter();

	}

}
