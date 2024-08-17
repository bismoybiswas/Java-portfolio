package Binding;
class Human_{
	public void walk() {
		System.out.println("Human Walks");
	}
}
class Boy_ extends Human_{
	public void walk() {
		System.out.println("Boy Walks");
	}
	public void walk2() {
		System.out.println("Boy Walks");
	}
}
public class dynamicBinding {

	public static void main(String[] args) {
		Human_ obj1 = new Human_();
		obj1.walk();
		Human_ obj2 = new Boy_();
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
 *  
 *  	Static Binding : Compile Time
 *  	Dynamic Binding: Run Time
 *  
 * 	 	Which methods can not be overridden?
 *  	1. private method
 *  	2. static method
 *  	3. final method
 *  
 *  	That means these methods will be executed
 *  	in compile time only not in run time.
 *  
 *  	Compile 
 *  	1. private method------>||
 *  	2. static method------->||
 *  	3. final method-------->||
 *  	METHOD----------------------------------->OVERRIDDEN
 *  	Static Binding [Early Binding]		Dynamic Binding [Late Binding]
 *  
 *  
*/