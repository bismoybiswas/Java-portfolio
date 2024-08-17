package StringPrograms;

public class Program1_charAt {

	/*
	 *  It will return back the particular character of that index.
	 *  Index starts from 0.
	 */
	public static void main(String[] args) {
		String Str = "JAVA Program";
		/*
		 * JAVA Program
		 * 012345678901
		 * 
		 * 
		 */
		System.out.println(Str);
		System.out.println("5th Character : "+ Str.charAt(5));
		
		System.out.println("The length of the String "+Str.length());
		/* Print All the characters of a String */
		
		for (int index = 0; index<Str.length(); index++) {
			System.out.println(Str.charAt(index));
		}
	}

}
