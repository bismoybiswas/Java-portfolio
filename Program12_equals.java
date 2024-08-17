package StringPrograms;

public class Program12_equals {
	/*
	 * equals() : checks content
	 * ==		: checks reference equality
	 */

	public static void main(String[] args) {
		
		String S1 = new String("Classroom");
		String S2 = new String("Classroom");
		String S3=S1;
		/*
		 * Here S3 and S1 both points same memory allocation.
		 * So, S1 and S3 are alias to each other.
		 */
		System.out.println(S1.equals(S2));
		System.out.println(S1.equals(S3));
		
		System.out.println(S1==S2);
		/*
		 * S1 (Classroom) , S2 (Classroom)
		 * Both content same but memory allocation different.
		 */
		System.out.println(S1==S3);
		/*
		 * S1 (Classroom) , S3 (Classroom)
		 * Both content same and point to same memory allocation.
		 * So, output will be true.
		 */

	}

}
