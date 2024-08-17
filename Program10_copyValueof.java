package StringPrograms;

public class Program10_copyValueof {
	/*
	 	S2.copyValueof(s1.toCharArray(), 0, s1.length()) :
	 	
	 	S1.toCharArray() : s1 As character Array
	 	0				 : Starting Index
	 	S1.length()		 : No of characters you need to pick up.
	 	
	 	We are trying to copy from 0th index.
	 	And wish to copy s1.length() characters.
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		String S1 = new String("Classroom");
		String S2 = new String();
		S2 = S2.copyValueOf(S1.toCharArray(), 0, S1.length());
		System.out.println(S2);
		S2 = S2.copyValueOf(S1.toCharArray(), 0, 5);
		System.out.println(S2);
		S2 = S2.copyValueOf(S1.toCharArray(), 5, 4);
		/*
		 * Starting Index : 5
		 * No of characters you need to pick : 4
		 * 5 6 7 8
		 * r o o m
		 */
		System.out.println(S2);
		S2 = S2.copyValueOf(S1.toCharArray(), 8, 1);
		System.out.println(S2);
		
	}

}
