package AbstractClassAndMethods;
abstract class Shape{
	abstract void draw();
	abstract void area();
	void same() {
		System.out.println("Same for all");
	}
	/*
	 * To write a function without body,
	 * add abstract before method name.
	 * 
	 * An abstract class may contain more than one abstract methods and
	 * non-abstract methods also.
	 * 
	 * For Non-Abstract method,
	 * the method will be inherited but no need to write further definition.
	 * 
	 * For Abstract method,
	 * We have to write further definition.
	 */
	
/*
 *   A class with Keyword Abstract
 *   may or may not contain Abstract method.
 *   
 *   A class with minimum one abstract method should be an abstract class.
 *   
 *   An abstract class may contain both Abstract Method and non-abstract method.
 *   
 */
}
abstract class Ellipse extends Shape{
	abstract void display();
	/* By Inheritance */
	/*
	 	abstract void draw();
		abstract void area();
		void same() {
			System.out.println("Same for all");
		}
	 
	 */
}

/*
 * 1. Abstract Class may be inherited by Abstract Class/Non-Abstract Class
 * 2. Abstract Class may contain nothing. But if we define abstract methods
 * with in a Class then that class must be abstract Class.
 * 
 */

class Example1 extends Ellipse{
	/* By Inheritance */
	/*
	 	abstract void display();
	 	abstract void draw();
		abstract void area();
		void same() {
			System.out.println("Same for all");
		}
	 
	 */
	@Override
	void display() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	void draw() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	void area() {
		// TODO Auto-generated method stub
		
	}
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("Rectangle Drawing");
	}
	void area() {
		System.out.println("Rectangle Area");
	}
}
/*
 * 	When Rectangle class inherits an abstract class "Shape",
 * 	then Rectangle class must contain those abstract methods with body.
 * 
 * Without implementation of abstract method will generate error.
 */
class Circle extends Shape{
	void draw() {
		System.out.println("Circle Drawing");
	}
	void area() {
		System.out.println("Circle Area");
	}
}
public class AbstractClassExample {

	public static void main(String[] args) {
		//Shape s = new Shape();
		/* We can not instantiate the abstract class. */
		Rectangle r = new Rectangle();
		r.area();
		r.same();
		r.draw();
		Shape rec = new Rectangle();
		Shape cir = new Circle();
		/*
		 * 	Rectangle is a sub-Catagory of Shape
		 * 	Circle is a Sub- Category of Shape
		 */
		rec.draw();
		rec.area();
		rec.same();
		cir.draw();
		cir.area();
		cir.same();
	}

}
/*
 *  We may not create object of abstract class.
 *  But we may create of Non Abstract class even they are extending Abstract Class.
 */

/*
*	Why we can't create object of abstract class?
*	abstract contains abstract or non abstract methods. And we know
*	abstract method does not have any definition in abstract class.
*	So, creating an object of abstract class and calling abstract method
*	by that object has no implementation. So, JAVA does not allow.
*
*/