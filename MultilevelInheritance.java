package InheritancePrograms;
class GrandParent{
	public int x=10;
	private int y=20;
	protected int z=30;
	void displayG() {
			System.out.println("Grandparent method display");
			System.out.println("Public:x:"+x);
			System.out.println("Private:y:"+y);
			System.out.println("Protected:z:"+z);
	}
}
/*
 	
 	Class Name : GrandParent
 	Data Members : x,y,z
 	Methods : displayG()
 	Private Data members : y
 	
 	As y is private data member, it can not be inherited
 	That means y can not be inherited by Father and Son.
 	It can be accessed only by its (GrandParent) public / protected method.
 	As an example:
 	here with in displayG(), we have used private data member y.
 	So, y can be accessed by displayG() method only.
 	
 	
 */

class Father extends GrandParent{
		public int a=40;
		private int b=50;
		protected int c=60;
		void displayF() {
			System.out.println("Father method display");
			System.out.println("Public:x:"+x);
			System.out.println("Protected:z:"+z);
			System.out.println("Public:a:"+a);
			System.out.println("Private:b:"+b);
			System.out.println("Protected:c:"+c);
		}
}

/*
 	
 	Class Name	: Father
 	Data Members: a,b,c
 	Inherited Data Members : x,z
 	Methods : displayF()
 	Inherited Methods : displayG()
 	Private Data members : b
 	
 	b can not be inherited by child class Son.
 	
 	
 */
class Son extends Father{
	public int i=70;
	private int j=80;
	protected int k=90;
	void displayS() {
			System.out.println("child method display");
			System.out.println("Public:x:"+x);
			System.out.println("Protected:z:"+z);
			System.out.println("Public:a:"+a);
		  //System.out.println("Private:b:"+b);
			System.out.println("Protected:c:"+c);
			System.out.println("Public:i:"+i);
			System.out.println("Private:j:"+j);
			System.out.println("Protected:k:"+k);
	}
}

/*
      	Class Name	: Son
 		Data Members: i,j,k
 		Inherited Data Members : x,z,a,c
 		Methods : displayS()
 		Inherited Methods : displayG(), displayF()
 		Private Data members : b
 */
public class MultilevelInheritance {

	public static void main(String[] args) {
		GrandParent G = new GrandParent();
		G.displayG();
		//GrandParent class object can access only its own method.
		
		Father F = new Father();
		F.displayG();
		F.displayF();
		/*
		 * Father Class object can access its own method and GrandFather (As it is Parent) Method.
		 */
		
		Son S = new Son();
		S.displayG();
		S.displayF();
		S.displayS();
		/*
		 * Son Class object can access its own method and GrandFather and Parent Method.
		 */
	}

}
