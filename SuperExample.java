package InheritancePrograms;

class One{
	int a=50;	//Data member a : this.a
	One(int a){	//Parameter a : a
		System.out.println("Parent Constructor Calling");
		System.out.println("parameter a = " + a);
		System.out.println("Data-member a = " + this.a);
		this.a = a;
		System.out.println("Data-member a = " + this.a);
		
	}
	void display() {
		System.out.println("Parent Display()");
	}
}

/*
 * 	Class One :
 * 	constructor 		: One()
 * 	Data Member			: a (integer)
 *	Member Function		: display()
 */
class Two extends One {
	int a = 20;
	Two(int a, int b) //a=70 b=30
	{
		super(b); // super(30);  Parent One.a = 30 (mandatory)
		
		System.out.println("Child Constructor Calling");
		System.out.println("a = " + a + " b = " + b);
		System.out.println("Child Data member a = " + this.a);
	}
	void display() {
		super.display();
		System.out.println("Child Display()");
		System.out.println("The value of a : "+this.a);
		System.out.println("The value of a : "+super.a);
	}
}
/*
 * 	Class One :
 * 	constructor 	: Two()
 * 	Data Member		: a (integer), a (integer) 	: Parent [Overridden]
 *	Member Function	: display(), display() 		: Parent [Overridden]
 */
public class SuperExample {

	public static void main(String[] args) {
		
		System.out.println("Parent Class obj :: obj1");
		One obj1 = new One(10);
		obj1.display();
		
		System.out.println();
		System.out.println("Child Class Obj :: obj2");
		Two obj2 = new Two(70,30);
		/*
		 * Flow of Calling:
		 * 1. At the time of obj2 creation,
		 * Constructor of class Two will be invoked.
		 * 
		 * 2. At the line one of constructor Two,
		 * super() is mentioned.
		 * That means it will call the constructor of Parent class.
		 * 
		 * 3. After complete of Parent class constructor execution 
		 * it will again back to child class constructor at the end of
		 * super() calling
		 * 
		 * 4. Rest part of constructor two will be executed.
		 * 
		 */
		obj2.display();

	}

}

/*
 super() for constructor
 1. Inheritance is required.
 2. If we mention constructor in the Parent class,
 	then super() is mandatory to define in child class constructor.
 3. If there is no constructor in the Parent class.
 	then super() is not needed in child class.
 4. super() should be placed at the very 1st line of the child class.
 	Any other position will result compilation error.
 5. For Parent class default constructor, child class super() is not
 	mandatory.
 	
 	At the time of Child object creation :
 	Parent Constructor Calling => Child Constructor Calling
 	
 	
*/