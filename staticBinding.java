package Binding;
class Human{
	public static void walk() {
		System.out.println("Human Walks");
	}
}

class Boy extends Human{
	public static void walk() {
		System.out.println("Boy Walks");
	}
}
public class staticBinding {

	public static void main(String[] args) {
		Human obj1 = new Boy();
		/*
		 *  Reference : Human Type
		 *  Object : Boy
		 */
		Human obj2 = new Human();
		
		obj1.walk();
		obj2.walk();

	}

}

/*
 *  Static Binding vs Dynamic Binding:
 *  1.  Static Binding happens at a Compile-Time
 *  	Dynamic Binding happens at Run-Time
 *  
 *  2.  Binding of private, static and final methods always happen at compile time
 *  	since these methods can not be overridden.
 *  	When the method overriding is actually happening and the reference of 
 *  	Parent Type is assigned to the object of the Child class type then such
 *  	binding is resolved during runtime.
 *  
 *  3.  The binding of overloaded methods is static and the binding of overridden
 *  	methods is dynamic.
 *  
 *  Parent Class : Human
 *  Method: Walk()
 *  
 *  Child Class : Boy
 *  Method: Walk()
 *  
 *  Now Boy extends Human
 *  So, Boy should have 2 methods :
 *  1. walk() from Human
 *  2. walk() from itself (Boy)
 *  If it would happen, then method overriding would happen.
 *  ad walk() of Boy class would get more priority.
 *  
 *  When?
 *  If we create a reference of Boy class and store it with in Human class object.
 *  
 *  But it is not possible.????
 *  As we have added static before every walk(), then obviously,
 *  it will be resolved at compile time but not in run-time.
 *  Method Overriding is happened in run-time.
 *  
 *  So, we can clearly watch a conflict here.
 *  That's why,
 *  Human object can not access the walk() of Boy class.
 *  
*/