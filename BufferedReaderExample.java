package TakesUserValues;

import java.io.*;

public class BufferedReaderExample {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		/*
		 * BufferedReader : ClassName
		 * Object : reader
		 * new : Keyword
		 * Functionality:
		 * Creates a buffering character-input stream that uses a default-sized input buffer
		 * 
		 * JRE > java.base JAR > java.io Package > BufferedReader.class
		 * 
		 * InputStream System.in => InputStream in
		 * [Class : InputStream] Return=> Reader Class obj Reference
		 * Reader -- new INputStreamReader (System.in)
		 * 
		 * We are passing System.in of Class InputStream
		 * in the constructor of InputstreamReader Class.
		 * 
		 * new InputStreamReader(Sytem.in) ::
		 * It will return the reference of Reader Class.
		 * 
		 * new BufferedReader(the reference of Reader Class);
		 * Now we are passing Reader Class reference with in BufferedReader()
		 */
		
		System.out.println("Enter your name : ");
		String name = reader.readLine();
		/*
		 * reader.readLine() -
		 * It will help you to take
		 * the sentence from user.
		 * 
		 */
		System.out.println("The name is: "+name);
		System.out.println("Enter a word: ");
		int a = reader.read();
		/*
		 * Suppose, User input is "abc" for reader.read()
		 * With in a variable,
		 * only the first character of "abc" that is "a"
		 * will be stored.
		 * 
		 * It looks like:
		 * int a='a';
		 * int a=97;
		 * 
		 * Because, int variable can store only ascii of a character not
		 * the character itself.
		 * 
		 */
		System.out.println("The ascii value is: "+a);
		reader.readLine();
		/* Integer Number */
		System.out.println("Enter integer number: ");
		int num = Integer.parseInt(reader.readLine());
		System.out.println("The value is "+num);
		
		/* Float Number */
		System.out.println("Enter float number: ");
		float f = Float.parseFloat(reader.readLine());
		System.out.println("The value is "+f);
		
		/* Double Number */
		System.out.println("Enter double number: ");
		double d = Double.parseDouble(reader.readLine());
		System.out.println("The value is "+d);
		
		/*
		 * int, float, double - Data types
		 * Integer, Float, Double .. - Wrapper Class
		 * 
		 * 
		 */
		
		/* Boolean Value */
		System.out.println("Enter Boolean value: "); /* true/false */
		boolean b = Boolean.parseBoolean(reader.readLine());
		System.out.println("Your Response: "+b);
		reader.close();
	}

}
