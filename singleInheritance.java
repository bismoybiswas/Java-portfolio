package InheritancePrograms;
class Parent{
	public int a=10;
	private int b=20;
	protected int c=30;
	
	void displayP() {
		System.out.println("Parent Method - Display");
		System.out.println("Public      	: a : "+a);
		System.out.println("Private      	: b : "+b);
		System.out.println("Protected      	: c : "+c);
	}
}

/*
 	Class Name : Parent
 	Data Member :
 		1. public int a = 10;
 		2. private int b = 20;
 		3. protected int c = 30;
 	
 	Member Functions/Method:
 	displayP()
 */

class Child extends Parent{
	public int x=10;
	private int y=20;
	protected int z=30;
	
	
	void displayC() {
		System.out.println("Child Method - Display");
		System.out.println("Public      	: a : "+a);
	  //System.out.println("Private      	: b : "+b);
		System.out.println("Protected      	: c : "+c);
		
		System.out.println("Public      	: a : "+x);
		System.out.println("Private      	: b : "+y);
		System.out.println("Protected      	: c : "+z);
	}
}
/*
	Class Name : Child
	Data Member :
		1. public int x = 10;
		2. private int y = 20;
		3. protected int z = 30;
	
	Member Functions/Method:
	displayC()

	----------------------------------------
	Inherited Properties:
	Class Name: Parent
	Data Members:
		1. public int a = 10;
		2. protected int c = 30;
	

	Member Functions/Method:
	displayP()
	----------------------------------------
	
	:: FINAL PROPERTIES OF CLASS CHILD ::
	
	Data Members:
	1. public int x = 10;		(Child)
	2. private int y = 20;		(Child)
	3. protected int z = 30;	(Child)
	4. public int a = 10;		(Parent)
 	5. protected int c = 30;	(Parent)
 	
 	
 	Methods:
 	1. displayP()			(Parent)
 	2. displayC()			(Child)
 	
 	
*/



public class singleInheritance {

	public static void main(String[] args) {
		 
		
		Parent P = new Parent();
		P.displayP();
		
		System.out.println();
		
		Child C = new Child();
		C.displayP();
		C.displayC();

	}

}

/*
 Child extends Parent :
 It means child class inherits the properties of Parent class.
 
 Parent Class / Super Class / Base Class
 Child CLass / Derived CLass / Sub Class
 
 
 
*/
