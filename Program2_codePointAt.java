package StringPrograms;
public class Program2_codePointAt {
	/*
	 * codePointAt() :
	 * This method will help us to get the ascii character
	 * of a particular indexed character.
	 * 
	 */
	public static void main(String[] args) {
		String Str = "ABCabc";
		System.out.println(Str.charAt(0) + " " + Str.codePointAt(0));
		/*
		 * Str.codePointAt(0)
		 * ASCII character at index 0 of String Str.
		 */
		for(int index=0; index<Str.length(); index++) {
			System.out.println(Str.charAt(index) + " " + Str.codePointAt(index));
		}
	}

}