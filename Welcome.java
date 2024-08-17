/*
 * Here, if we define, public before a class name, 
 * then we have to create a separate file named as Welcome.java.
 * And within that file we have to define.
 * 
 * We cannot define public static void main -- without static.
*/
package FirstJavaProgram;
public class Welcome {
	public static void main(String[] args) {
		System.out.println("Classroom");
		System.out.print("Classroom\n");
		System.out.printf("%d",2015);
	}
	
}
/*
Explain : public static void main(String[] args)
public :  This keyword is an access modifier that 
		  indicates that the method can be accessed from anywhere ,
		  not just within the class where it is defined.
static :  This keyword indicates that the method belongs to 
	      the class itself, rather than to a specific
		  instance of the class.
[Note:
If we wish to access any non-static method ,
then we have to create object of that class.
And by that object we can access non-static method.

If main() is non-static::
Step 1: create object of the class(Welcome)
Step 2: access the method (main) by that object.]

void :    This keyword indicates that the method does not 
		  return any value not even 0.
main :	  This is the name of the method. The java runtime
		  system looks for this method as the entry point of
		  the program.
String[] args :
		  This is the parameter list of the method.
		  It specifies that the method expects an array of strings
		  as input which is commonly used to pass command-line
		  arguments to the program.
*/