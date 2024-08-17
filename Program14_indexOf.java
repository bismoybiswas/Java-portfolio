package StringPrograms;

public class Program14_indexOf {

	public static void main(String[] args) {
		String s1 = new String("Tomorrow is Christmas.");
		String s2 = new String("Christ");
		
		System.out.println(s1.indexOf(s2));
		/*
		 	Here s1 contains a string : Tomorrow is Christmas.
		 	Here s2 contains a string : Christ.
		 	
		 	s1.indexOf(s2) => s1.indexOf(s2,0)
		 	
		 	Christ this word is present at 12th index of first string
		 	from the beginning.
		 	so, Output is 12.
		 	
		 	Return type of String1.indexOf(String2) --> int
		 */
		String s3 = new String("Sat is day before Sun. Mon is day after Sunday.");
		String s4 = new String("Sunday");
		System.out.println(s3.indexOf(s4,25));
		/*
		  s3.indexOf(s4,25)
		  This method will find s4 from 25th character of s3 string.
		  So, here "sun" word is reported twice.
		  So, after 25 index next Sun is present at 40th index.
		  Then output is 40.
		 */
		System.out.println("Hello".indexOf("Bye"));
		/*
		 * If Substring is not present within main string,
		 * then output will be -1.
		 */
	}

}
