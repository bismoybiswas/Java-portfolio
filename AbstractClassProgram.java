package AbstractClassAndMethods;
//abstractClassProgram.java

/*
 * If a class contain, at least one abstract method,
 * then that class must be declared as abstract class.
 * 
 * But for vice versa,
 * if a class is defined as abstract class,
 * then that class may or may not contain abstract method.
 */
abstract class shape{
	int a = 10;
	static int b = 20;
	abstract void draw();
	/*
	 * If for any implementation details is not defined,
	 * Then that method must be defined with abstract keyword.
	 * 
	 * If we miss this keyword, we will get error.
	 */
	/*
	 * Method name same for all inherited classes but
	 * implementation details different.
	 * 	If we define a method as abstract,
	 * 	then we can not write any implementation details for it.
	 */
	void display() {
		System.out.println("Shape class display.");
	}
	/*
	 * An abstract class may contain -
	 * 1. Abstract method
	 * 2. Non-abstract method
	 */
	
	public static void dis1() {
		
	}
	/*
	 * An abstract class may contain -
	 * 1. Static method
	 * 2. Non-static method
	 */
	
	/*
	 default void dis2(){
	 
	 }
	 */
	/*
	 * Method name and implementation same. then non-abstract method.
	 */
}
/*
 * shape is an abstract class.
 * here we have defined abstract method.
 * 
 * It means if any class extends the class shape,
 * then they must have write the full implementations for
 * all the abstract methods.
 */
/*
 	Method Overridden vs Abstract Class Concept:
 	
 	In case of method overridden,
 	then Parent class and child class both must have
 	same method along with implementation details.
 	
 	In case of Abstraction Class,
 	then Parent class and child class both must have
 	same method, but Parent class does not contain method implementation.
 	Child class contains.
 */
class rectangle extends shape{
	/*
	 * 
	 * Shape is an abstract class.
	 * Now for Shape only one abstract method is present.
	 * 1. draw()
	 * so, here when Rectangle class extends Shape,
	 * then Shape class must write the implementation details for
	 * abstract method draw().
	 */
	void draw() {
		System.out.println("drawing rectangle");
	}
}

/*
 * Here Rectangle class extends class Shape.
 * Rectangle class must have to define draw().
 */
class circle extends shape{
	//Abstract method implementation
	void draw() {
		System.out.println("drawing circle");
	}
	//Non Abstract method implementation
	void displaycircle() {
		System.out.println("Circle Display.");
	}
}
/*
 * Here Circle class extends class Shape.
 * Circle class must have to define draw().
 */
public class AbstractClassProgram {

	public static void main(String[] args) {
		shape s= new circle();
		s.draw();
		
		//For non abstract method access we need to create non-abstract class object.
		shape t= new rectangle();
		t.draw();
		t.display();
		//Shape x = new Shape();
		
		//For abstract method access we need to create abstract class object.
		circle c = new circle();
		c.displaycircle();

	}

}
/*
 1. What is Abstract Class? Features.
 	a) If we define one abstract method within one class,
 	   then obviously
 	   that class must be defined as abstract class.
 	b) Suppose, there are no abstract method in a class,
 	   still we can define that class as abstract
 	   to restrict the class from instantiation (Object create).
 	one class may contain both abstract and non-abstract method.
 2. Features of abstract within abstract class.
 3. Features of non-abstract within abstract class.
 4. Overriding vs Abstract Class
 5. Can we create object for abstract class? No
 6. Can we inherited class contain new methods except implementation abstract method?
 If a class contains at least one abstract method,
 then class should be defined with abstract.
 
 If a class defined as abstract, it does not mean 
 it holds at least 1 abstract method.
 
 */
