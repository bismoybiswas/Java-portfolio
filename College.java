package Static_Programs;

public class College {
	static double fund=0; //Static data member
	int x=10;			//Non-Static data member
	
	/*Static method*/
	static void Admission() {
		System.out.println("Admission Done");
	}
	/*Static method*/
	static void Fest() {
		System.out.println("Fest going on");
		System.out.println("Total Fund: "+fund);
		/*
		 * With in Static Method,
		 * We can define static data members.
		 * but
		 * we can not define non-static data members.
		 * 
		 */
		
//		System.out.println("Non-Static x: "+x);
		
	}
	/*Static method*/
	static void Farewell() {
		System.out.println("Farewell going on");
	}
	public static void main(String[] args) {
		
		College.Admission();
		College.Fest();
		College.Farewell();
		
		System.out.println();
		/*
		 * Admission(), Fest(), Farewell()
		 * These are the Static methods that can be accessed
		 * by Class Name and Object Name.
		 * 
		 * Till now,
		 * we have not created any object of the classes.
		 * we have accessed Static methods by Class Name.
		 * 
		 */
		
		College Techno = new College();
		Techno.Admission();
		Techno.Fest();
		Techno.Farewell();
		System.out.println();
		/*
		 * Here we have accessed Static variables by the objects.
		 */
		College Heritage = new College();
		Heritage.Admission();
		Heritage.Fest();
		Heritage.Farewell();
		/*
		 * Here we have accessed variables by the objects.
		 */

	}

}
