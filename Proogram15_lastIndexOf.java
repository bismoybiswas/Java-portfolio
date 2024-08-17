package StringPrograms;

public class Proogram15_lastIndexOf {

	public static void main(String[] args) {
		
		String s1 = new String("Sat is day before Sun. Mon is day after Sun.");
		String s2 = new String("Sun");
		System.out.println(s1.lastIndexOf(s2));
		// Sat is day before Sun. Mon is day after **Sun**, => 40
		System.out.println(s1.lastIndexOf(s2,0));
		// Sat is day before Sun. Mon is day after **Sun**, => -1
		// As here we have started checking from 0 to left hand side,
		// then Sun is not present there, so it returns -1.
		System.out.println(s1.lastIndexOf(s2,s1.length()));
		// s1.lastIndexOf(s2,s1.length()) => s1.lastIndexOf(s2,44)
		// It will check from 44 to 0. Sun is present in S1 or not.
		System.out.println(s1.lastIndexOf(s2,25));
		// s1.lastIndexOf(s2,25)
		// It will check from 25 to 0. Sun is present in S1 or not.
		
	}

}
