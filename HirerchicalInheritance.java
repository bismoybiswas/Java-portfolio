package InheritancePrograms;
class car{
	public int a=10;
	private int b=20;
	protected int c=30;
	void displayC() {
		System.out.println("Car method display:");
		System.out.println("public : a : "+a);
		System.out.println("private : b : "+b);
		System.out.println("protected : c: "+c);
	}
}
/*
 	Car is here the Parent Class.
 	Data Members : a, b, c
 	Methods 	: displayC()
 	Private Data Member : b
 	b can not accessed from inherited class like bus, metro, train
 	
 */
class bus extends car{
	public int x=100;
	private int y=200;
	protected int z=300;
	void displayB() {
		System.out.println("______________");
		System.out.println("bus method display:");
		System.out.println("car public : a : "+a);
		System.out.println("car protected : c: "+c);
		System.out.println("bus public : x : "+x);
		System.out.println("bus private : y : "+y);
		System.out.println("bus protected : z: "+z);
	}
}
	
	/*
	   bus is the child class of Parent class Car.
	   Data member : x, y, z
	   Inherited Data Member	: a, c
	   Member Function / method	: displayB()
	   Inherited Member Function / method : displayC()
	   
	   
	 */
	
class train extends car{
	public int q=100;
	private int p=200;
	protected int r=300;
	void displayT() {
		System.out.println("______________");
		System.out.println("train method display:");
		System.out.println("car public : a : "+a);
		System.out.println("car protected : c: "+c);
		System.out.println("train public : x : "+q);
		System.out.println("train private : y : "+p);
		System.out.println("train protected : z: "+r);
	}
}

/*
 	train is the child class of Parent class Car.
 	Data member : p,q,r
 	Inherited Data Member : a, c
 	Member Function /method : displayT()
 	Inherited Member Function / method : displayC()
 */
class metro extends car {
	public int o=1;
	private int w=01;
	protected int x=001;
	void displayM() {
		System.out.println("______________");
		System.out.println("metro method display:");
		System.out.println("car public : a : "+a);
		System.out.println("car protected : c: "+c);
		System.out.println("metro public : x : "+o);
		System.out.println("metro private : y : "+w);
		System.out.println("metro protected : z: "+x);
	}
}

/*
 	metro is the child class of Parent class Car.
 	Data member : o,w,x
 	Inherited Data Member : a, c
 	Member Function /method : displayM()
 	Inherited Member Function / method : displayC()
 */
public class HirerchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car t=new car();
		t.displayC();
		bus b= new bus();
		b.displayB();
		b.displayC();
		train o= new train();
		o.displayT();
		o.displayC();
		metro m=new metro();
		m.displayM();
		m.displayC();
		
		
		System.out.println("Public Data Member of Class Car : "+ t.a);
		System.out.println("Public Data Member of Class Car : "+ t.c);

	}

}

