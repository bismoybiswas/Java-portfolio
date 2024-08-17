package StringPrograms;

public class Program8_contains {
	/*
	 	contains() :
	 	It will help you to know
	 	Substring is present in main string or not?
	 */

	public static void main(String[] args) {
		String str1 = new String("Classroom");
		System.out.println("Classroom".contains("Class"));
		System.out.println(str1.contains("class"));
		System.out.println(str1.contains("ssro"));
		System.out.println(str1.contains("door"));
		System.out.println(str1.contains(str1));

	}

}
