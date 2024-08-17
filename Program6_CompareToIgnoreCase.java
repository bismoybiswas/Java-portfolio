package StringPrograms;

public class Program6_CompareToIgnoreCase {
	
	/*
	 		compareToIgnoreCase();
	 		In this scenario,
	 		it does not matter of the cases for both the string.
	 		
	 	0 : Both are equal,
	 	Pos : Ascii of 1st mismatched characters b/w 2string, 1st one is greater
	 	Neg : Ascii of 1st mismatched characters b/w 2string, 1st one is greater
	 
	 */

	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("ABC");
		
		System.out.println(s1.compareTo(s2));
		/*
		 * ASCII(a) - ASCII(A) = 97-65 = 32
		 */
		System.out.println(s1.compareToIgnoreCase(s2));
		/*
		 * ASCII(A/a) - ASCII(A/a) = 0
		 */

	}

}
