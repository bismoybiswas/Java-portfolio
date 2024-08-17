package InheritancePrograms;


class Super{
	private int a=10;
	private void displayS() {
		System.out.println("Private Data member : "+a);
	}
	/*
	 * Here this private method,
	 * We can not access from main()
	 * creating object of the class.
	 * 
	 * 
	 */
	//Spoiler or, Leaker.
	void display2() {
		displayS();
	}
	/*
	 * Solution:
	 * To access the output of private method,
	 * from main()
	 * define calling that private method,
	 * from another non-private method.
	 */
}

class Sub extends Super{
	private int b=20;
	private void show() {
		System.out.println("Private Data member : "+b);
	}
}
public class SingleInheritanceEx {

	public static void main(String[] args) {
		Super s = new Super();
		Sub sb = new Sub();
		
		s.display2();
		sb.display2();

	}

}
