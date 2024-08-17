package Static_Programs;
class Demo {
	//Static Data Member
	static int staticVar=10;
	//Non-Static Data Member
	int nonstaticVar=20;
	
	//Static Method
	static void staticMethod() {
		System.out.println("Static Data Member : "+staticVar);
		//System.out.println("Non-Static Data Member : "+nonstaticVar);
	}
	//Non-Static Method
	void nonstaticmethod() {
		System.out.println("Static Data Member : "+staticVar);
		System.out.println("Non-Static Data Member : "+nonstaticVar);
	}
}
public class StaticExample {

	public static void main(String[] args) {
		System.out.println("Static Variable : "+Demo.staticVar);
		Demo.staticMethod();
		System.out.println();
		
		
		Demo d = new Demo();
		System.out.println("Static Variable : "+d.staticVar);
		System.out.println("Non-Static Data Member : "+d.nonstaticVar);
		d.staticMethod();
		d.nonstaticmethod();
	}

}
/*
 	Static Data Member vs Non-Static Data Member
 	* Static Data Member is sharable between Class and objects of the class.
 	* Non-Static Data is sharable only within individual objects of the class.
 	
 	* We can access Static Data member without creating any object of the class.
 	* Non-Static Data member can not be accessed without object creation.
 	
 	* Static Data-member can be written within both Static and Non-Static Method.
 	* Non-Static Data-member can be written only within Non-Static Method.
 	
 	
 	
 	Static Method vs Non-Static Method
 	* Static Method can be accessed by Class name and objects.
 	* Non-Static Method can be accessed after object creation only.
 	
 	* Static Method can be accessed y without creating objects by class name.
 	* Non-Static Method can be accessed after object creation only.
 	
 	* Static method can use static data members only.
 	* Non-Static method can use static & Non-static data members both.
 	 
 	 
 	
 	Why we can not write non-static variable with in Static method?
 	Case 1:  Static method can be accessed without creating any objects of the class.
 	Case 2:  Non-static variable is not sharable between class and objects.
 			 with out creating objects Non-Static variable can not be accessed.
 			 
 	So, Based on case 1 and case 2, as non-static data members can not be 
 	accessed by the class and without creating any objects,
 	that's why we can not write non-static variable with in Static method.
 	
 */