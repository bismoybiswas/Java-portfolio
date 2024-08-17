package StringPrograms;

public class Program4_compareTo {
	/*
	 * compareTo() :
	 * ASCII(1st Mismatched Character in String1) -
	 * ASCII(1st Mismatched Character in String2) <=> Neg, 0, Pos
	 * 
	 * 0 <=> Both are equal Strings.
	 * 
	 */
	public static void main(String[] args) {
		String s1 = new String("JAVA");
		String s2 = new String("JAVA");
		String s3 = "Python";
		String s4 = "JBple";
		String s5 = s1;
		System.out.println(s1.compareTo(s2));
		/*
		 * JAVA
		 * JAVA
		 * As There is no difference b/w s1 and s2 then,
		 * ASCII difference of all the characters also will be 0.
		 */
		System.out.println(s1.codePointAt(0));
		/*ASCII of First character in S1 : ASCII(J) = 74 */
		System.out.println(s3.codePointAt(0));
		/*ASCII of First character in S3 : ASCII(J) = 80 */
		System.out.println(s1.compareTo(s3));
		// ASCII(J) - ASCII(P) = 74-80 = -6
		System.out.println(s1.compareTo(s4));
		// ASCII(A) - ASCII(A) = 65-66 = -1
		System.out.println(s1.compareTo(s5));
		System.out.println(s1.compareTo(s1));
	}

}
