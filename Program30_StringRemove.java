package StringPrograms;

public class Program30_StringRemove {

	public static void main(String[] args) {
		String s1 = new String("Today is Saturday");
		s1 = s1.replace("is", ",");
		System.out.println(s1);
		/*
		 * General Syntax:
		 * String.replace("What string to replace", "By which String");
		 */
		
		s1 = new String("Today is Saturday Saturday");
		s1 = s1.replace("is", ",").replace("Saturday", "Sunday");
		/*
		 * s1 = s1.replace("is", ",").replace("Saturday", "Sunday")
		 * ="Today, Saturday".replace("Saturday", "Sunday")
		 * = Today, Sunday
		 */
		System.out.println(s1);

	}

}
