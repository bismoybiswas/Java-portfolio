package StringPrograms;

public class Program20_trim {

	public static void main(String[] args) {
		String s1 = new String("       Hello    JAVA     Programmers        ");
		System.out.println(s1);
		System.out.print("--");
		System.out.print(s1);
		System.out.println("--");
		
		System.out.print("--");
		System.out.print(s1.trim());
		System.out.print("--");
		
		
		/*
		  trim() will help to remove leading space and trailing space.
		 */

	}

}
