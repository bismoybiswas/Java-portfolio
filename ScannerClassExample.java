package TakesUserValues;

import java.math.BigInteger;
import java.util.*;
/*
 * Java Class Convention;
 * Class Name starts with Capital letter.
 * If class name is a combination of multiple words,
 * then Each word first character must be in caps.
 * 
 * Packages name - All small letters
 * Methods - word1word2word3....()
 * 
 */
/*How to create an object in Java?*/
/*
 * ClassName ObjectName = new Constructor(Parameter));
 */

public class ScannerClassExample {
	public static void main(String[] args) {
		/*Creating Object of Scanner Class*/
		Scanner scan = new Scanner(System.in);
		/*
		 	Project > JRE System Library > java.base (JAR)
		 	java.util (Package) > Scanner Class
		 		scanner : Class
		 		scan : Object
		 		new : Keyword (used for memory allocation)
		 		Scanner(System.in) : Constructor
		 
		 	System.in : It is static data member of System Class.
		 */
		
		// How to take Integer Input from User?
		System.out.println("Enter a value : ");
		// scanf("%d", &a);
		int a = scan.nextInt();
		/*
		 	scan : Object
		  	nextInt() : Method
		 
		 	This line is used to take user input as integer and store with in a.
		 */
		System.out.println("The output is: "+a);
		
		
		// How to take float Input from User?
		System.out.println("Enter a fraction value: ");
		float f = scan.nextFloat();
		System.out.println("The output is: "+f);
		
		// How to take double Input from User?
		System.out.println("Enter a fraction value: ");
		double d = scan.nextDouble();
		System.out.println("The output is: "+d);
		
		scan.nextLine();
		// How to take String input from user?
		System.out.println("Enter your name: ");
		String s = scan.nextLine(); 
		System.out.println("The output is: "+s);
		
		// How to take Word as input?
		System.out.println("Enter your word: ");
		String w = scan.next(); //Word
		System.out.println("The output is: "+w);
		
		// How to take true/false as input?
		System.out.println("Enter choice: ");
		boolean ch = scan.nextBoolean();
		System.out.println("The output is: "+ch);
		
		//How to take BigInteger as input?
		System.out.println("Enter value: ");
		BigInteger b = scan.nextBigInteger();
		System.out.println("The output is: "+b);
		
		System.out.println("Enter a character: ");
		char c = scan.next().charAt(0);
		System.out.println("Your Character is: "+c);
		
		scan.close();
	}

}
