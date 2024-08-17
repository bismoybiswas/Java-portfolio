package StringPrograms;

public class Program13_equalIgnoreCase {

	public static void main(String[] args) {
		String s1 = new String("Classroom");
		String s2 = new String("CLASSROOM");
		String s3 = new String("Class");
		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		/*
		 s1.equalsIgnoreCase(s2)
		 
		 Here equalsIgnoreCase will not consider the case of 
		 the content.
		 
		 */

	}

}
