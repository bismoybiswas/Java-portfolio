package StringPrograms;

public class Program21_stripLeading {

	public static void main(String[] args) {
		String s1 = new String("   Hello   ");
		String s2 = s1.stripLeading();
		/*
			It will remove only the leading space.
		 */
		System.out.print("--");
		System.out.print(s2);
		System.out.print("--");

	}

}
