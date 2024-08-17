package InterfaceProgram;
interface MyInterface{
	int a = 10;
	public void method1();	//abstract method
	public void method2();	//abstract method
	public static void  method3() {
		System.out.println("Hello");
	}
	default void method4() {
		System.out.println("Hello");
	}
	default void method5() {
		
	}
	/*
	 * 
	 In an Interface,
	 1. Abstract Method should be defined as public. Not as default/protected/private.
	 2. For a static method, public is allowed.
	 3. For a non-static method private, public, abstract, strictfp, default allowed.
	 	protected not allowed.
	 4. For static : (default, abstract) or (public static / static) allowed
	 
	 Option 1:
	 public static void  method3() {
		System.out.println("Hello");
	 }
	 
	 Option 2:
	 static void  method3() {
		System.out.println("Hello");
	 }
	 
	 Option 3:
	 default void  method3() {
		System.out.println("Hello");
	 }
	 
	 Option 4:
	 abstract void method3();
	 
	 
	 NOT ALLOWED
	 public void  method3() {
		System.out.println("Hello");
	}
	ALLOWED
	public static void  method3();
	 */
}
/*
 * In MyInterface,
 * we have defined two abstract methods.
 * Abstract Methods: A method without any body(definition).
 * 
 */
	
// class -> Class [extends]
// class -> Interface [implements]
// interface -> Interface [extends]
	
/*
 * For any class which Implements
 * another Interface,
 * then the class must have to define
 * all the abstract methods that are defined within the method.
 */
	
class Demo implements MyInterface{
	//Abstract Method (Mandatory)
	public void method1() {
		System.out.println("Method1 implemented");
	}
	public void method2() {
		System.out.println("Method2 implemented");
	}
	
	//Non-Abstract Method (Optional)
	public void display() {
		System.out.println("Display Method : Non-abstract");
		
	}
}
/*
 * Here Demo is a class that implements the interface MyInterface.
 * So,
 * Demo class must have to implement both the methods
 * method1() and method2().
 * 
 * If Demo class implements MyInterface, it does not mean that
 * it must have only abstract methods.
 * It may declare non-abstract method.
 */
public class InterfaceExample {

	public static void main(String[] args) {
		// How to access abstract methods by Demo class.
		MyInterface obj = new Demo();
		// We are setting the reference of Demo class
		// within MyInterface object obj.
		obj.method1();
		obj.method2();
		
		//Static method
		MyInterface.method3(); 
		//obj.method3();
			
		/*
		 * Here we can access method3(),
		 * by Interface name.
		 * 
		 * By object name not allowed.
		 */
		obj.method4();
		
		
		// How to access Non-abstract methods by Demo class.
		Demo ob=new Demo();
		ob.display();
		ob.method1(); // [definition written in class]
		ob.method2(); // [definition written in class]
		//ob.method3();
		MyInterface.method3(); // [static method is accessible only through Interface]
		ob.method4(); //[Reuse from Interface to Class]
		
		/*
		 * From Implemented class,
		 * we can access,
		 * 1. Abstract methods.
		 * 2. Default methods.
		 * 3. To access static method with in class,
		 * we have to use, interfacename.methodname().
		 * 
		 */

	}
}


/*
 * 1. With in Interface we can define abstract methods.
 * 	like: public void method1(); / void method1();
 * 
 * 2. With in Interface we can define static methods.
 * 	like: public static void method3() { ... };
 * 
 * 3. With in Interface we can define default methods.
 * 	like: default void method4() { ... };
 * 
 * From main(), creating obj of interface with reference of Implementing Class,
 * we can access
 * 1. obj.abstractMethods
 * 2. obj.defaultMethods
 * 3. interfaceName.staticMethods()
 * 
 * So, options for a method:
 * a) void method();
 * b) static void method(){...}
 * c) default void method(){...}
 * 
 * 
 * 
 */


