/*
 * Class:
 * A class is a blueprint of similar type of objects.
 * A class has
 * 1. Data-Members
 * 2. Member functions/Method
 * 
 * Object:
 * An object is the reality of the class concepts.
 * After creation of the object,
 * We can access the data members and the member functions of the classes.
 * 
 * After creation of the object,
 * for object memory will be allocated separately.
 * 
 */
package Class.java;

public class Student {
	//Data Members
	String fname;
	String lname;
	int roll;
	
	/*
	 * What is constructor?
	 * -
	 * A constructor is a special member function,
	 * that is used to initialize the data members of the objects
	 * at the time of object creation.
	 * 
	 * A constructor can be classified as:
	 * 	a) Default Constructor
	 * 	[
	 * 	We will not pass any parameters.
	 * 	The data members of the object will be
	 * 	initialized here by some default values.
	 *	]
	 *	b) Parameterized Constructor
	 *	[
	 *	Here at the time of object creation,
	 *  We can pass one or more than one arguments
	 *  to initialize the data members of the objects
	 *  of the classes
	 *  ]
	 *  
	 *  Properties:
	 *  1. Class name and constructor name always same in Java
	 *  2. Constructor does not have any return type.
	 *  
	 */
	
	//Default constructor
	Student() {
		this.fname = "Anonymous";
		this.lname = "Anonymous";
	}
	
	// Parameterized Constructor : 1 Parameter
	Student(String fname) {
		this.fname = fname;
		this.lname = "Anonymous";
	}
	// Parameterized Constructor : 2 Parameter
	Student(String fname, String lname){
			this.fname = fname;
			this.lname = lname;
	}
	Student(String fname, int roll){
			this.fname = fname;
			this.roll = roll;
	}
	Student(int roll, String fname){
		this.fname = fname;
		this.roll = roll;
	}
	
/*
 
 1. Default Constructor + Any Parameterized Constructor
 2. Parameterized Constructor + Parameterized Constructor
 	a) No of parameters different
 	b) No of parameters same but their type of parameters different
 		(String, String)  :: (int, float)
 	c) No of parameters same and their type of parameters same,
 	then order of parameters different.
 	(String, int) :: (int, String)
 	
 	
 int  :  int
 */
	
	/*
	 * Getter:
	 * To fetch a value from a data-member of the class.
	 * 
	 * Setter:
	 * To fetch a value for a data-member of the class.
	 */
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public static void main(String[] args) {
		// Default Constructor
		System.out.println("Default Constructor ");
		Student Sayan = new Student();
		System.out.println("fname: "+Sayan.fname);
		System.out.println("lname: "+Sayan.lname);
		
		//Parameterized Constructor : 1 Parameterized
		
		System.out.println("1 Parameterized Constructor ");
		Student Sayani = new Student("Sayani");
		System.out.println("fname: "+Sayani.fname);
		System.out.println("lname: "+Sayani.lname);
		
		//Parameterized Constructor : 2 Parameterized
		
		System.out.println("2 Parameterized Constructor ");
		Student Ritam = new Student("Ritam", "Pal");
		System.out.println("fname: "+Ritam.fname);
		System.out.println("fname: "+Ritam.lname);
		
		Sayani.setLname("Sinh");
		System.out.println(Sayani.getFname()+" "+Sayani.getLname());
		Sayani.setLname("Sinha");
		System.out.println(Sayani.getFname()+" "+Sayani.getLname());

	}

}


/*
 *  1. What is Class?
 *  2. What is Object?
 *  3. What is Constructor?
 *  4. Types of Constructor.
 *  5. What is default constructor?
 *  6. What is Parameterized constructor?
 *  7. What is Setter?
 *  8. What is Getter?
 *  9. What is the utility of setter over constructor?
*/