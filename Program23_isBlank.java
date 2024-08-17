package StringPrograms;

public class Program23_isBlank {

	public static void main(String[] args) {
		String s1 = new String("     ");
		System.out.println(s1.isBlank());
		String s2 = new String("Heloo World");
		System.out.println(s2.isBlank());
		String s6 = new String("     ");
		System.out.println(s6.trim().length());
		
		String s3 = new String("    ");
		System.out.println(s3.isEmpty());
		String s4 = new String("Hello World");
		System.out.println(s4.isEmpty());
		String s5 = new String ("");
		System.out.println(s5.isEmpty());
		
		/*
		 Returns true if the string is empty or contains only
		 white space code points, otherwise false.
		 */
		/*
		 isEmpty() :
		 if String.length() == 0 : isEmpty() returns true.
		 if String.length() > 0 : isEmpty() returns false.
		 
		 isBlank() :
		 if String.trim().length() == 0 : isBlank() returns true.
		 if String.trim().length() > 0 : isBlank() returns false.
		 
		 If the whole string contains 0 characters or all
		 white characters then it will return true.
		 Else it will return false.
		 */

	}

}
