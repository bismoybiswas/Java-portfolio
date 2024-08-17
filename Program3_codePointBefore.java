package StringPrograms;

public class Program3_codePointBefore {
	/*
	 * codePointBefore() :
	 * It will return back the ascii character of the previous indexed character.
	 * 
	 * codePointBefore(Value);
	 * 0<value<length+1
	 */
	public static void main(String[] args) {
		String Str = "ABCabc";
		System.out.println(Str.charAt(5) + " " + Str.codePointBefore(6));
		
		/*
		 * Str.codePointBefore(6) = Str.codePointAt(5)
		 */

	}

}
