package InheritancePrograms;
class A{
	int a=10;
	final int b=30;
	void display() {
		System.out.println("Parent Display()");
	}
	void display2() {
		System.out.println("Parent Display()");
}
}

	/*
	 	Class Name	: A
	 	Data Member : a
	 	Method		: display()
	 */

class B extends A{
	int a=20;
	void display() {
		super.display();
		System.out.println("Child Display()");
		System.out.println("The value of a : "+this.a);
		System.out.println("The value of a : "+super.a);
		super.a=35;
		//super.b=35; //final data member can not be assigned with a new value.
		System.out.println("The value of b : "+super.b);
	}
}

	/*
	 	Class Name : B
	 	Data Member: a
	 	Method	: display()
	 	
	 	But by the property of Inheritance,
	 	Class B should have also:
	 	1) Data Member : a		[From Parent A]
	 	2) Method	: display() [From Parent A]
	 	
	 	But it is overridden by its own property.
	 	
	 	To access parent overridden property,
	 	we need super.
	 */
public class OverRiding {

	public static void main(String[] args) {
		A obj1 = new A();
		/*
		 * Here after creation of the object obj1,
		 * A must have the following properties:
		 * obj1.a=10
		 * obj1.display()
		 * 
		 */
		B obj2 = new B();
		/*
		 * Here after creation of the obj2,
		 * obj2 must have the following properties:
		 * 
		 * obj2.a=10	(Parent Property)
		 * obj2.display() (Parent Property)
		 * obj2.a=20
		 * obj2.display()
		 * 
		 */
		obj1.display(); //=> Parent Display()
		obj2.display(); // => Child Display()
		System.out.println(obj2.a);
		obj2.display();
	}

}

/*
 * By using super(),
 * We can access any data member and member function from Parent Class,
 * It doesn't mean that data member and member function should be overridden.
 * 
 * 
 * If a method or data member are similar in both Parent Class & Child Class
 * then if data members and method are defined as Private in Parent Class,
 * then these will not be inherited into Child Class.
 * 
 * 
 * Then Overridden concept will not be acceptable here.
 */
