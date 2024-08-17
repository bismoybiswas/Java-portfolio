package StringPrograms;

public class Program31_subsequence {

	public static void main(String[] args) {
		String S1 = "Classroom";
		System.out.println(S1.subSequence(0, 5));
		/*
		 * General Syntax :
		 * String_Object.subsequence(Start, End+1);
		 * 
		 * Classroom
		 * 012345678
		 * 
		 * S1.subsequence(0, 5) ; return type Character Sequence
		 * (String) S1.subsequence(0, 5) :
		 * Now we are implicit type casting,
		 * from Character Sequence to String.
		 */
		String s2 = (String) S1.subSequence(0, 5);
		System.out.println(s2);
		
		System.out.println(S1.subSequence(5, 9));
		/*
		  	Classroom
		  	012345678
		  	S1.subsequence(5, 9) : 5 to 8
		  	room
		 */
		String s7 = (String) "Hello".subSequence(0, 2);
		System.out.println(s7.repeat("Hello".length()));
		String s8 = (String) "Hello".subSequence("Hello".length()-2, "Hello".length());
		//String s8 = (String) "Hello".subSequence(5-2, 5);
		//String s8 = (String) "Hello".subSequence(3, 5);
		System.out.println(s8.repeat("Hello".length()));
	}

}
