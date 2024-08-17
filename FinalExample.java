package InheritancePrograms;

class parent{
	final int a=10; // We can not assign in final variable.
	int b = 20;
	int c = 30;
	void display1() {
		//this.a = 34; // We can not assign in final variable.
		System.out.println("Parent Class display1");
	}
	final void display2() {
		System.out.println("Parent Class display2");
	}
	/*
	 * If we define a final method display2(),
	 * then that method can not be inherited but we cannot redefine.
	 * That mean it directly restricts method override.
	 * 
	 */
	
}
class child extends parent{
	final int a =50;
	int b = 20;
	int c = 30;
	void display1() {
		//this.a = 5; //We can not assign in final variable.
		System.out.println("Parent Class display1");
	}
// 	void display2() {
//		System.out.println("Parent Class display1");
//	}
}

public class FinalExample {

	public static void main(String[] args) {
		parent p = new parent();
		//p.a = 23;
		System.out.println(p.a);
		System.out.println(p.b);
		System.out.println(p.c);
		
		child C = new child();
		System.out.println(C.a);
		System.out.println(C.b);
		System.out.println(C.c);
		C.display1();
		C.display2(); // final method can be inherited in a child class obj.
	}

}
