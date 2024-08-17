package StringPrograms;

public class Program27_join {

	public static void main(String[] args) {
		
		String s1 = new String("Sun, Mon, Tue, Wed, Thu, Fri, Sat");
		System.out.println(s1);
		String arr[] = s1.split(", ");
		/*
		 * After split,
		 * it will return Array of Strings.
		 */
		// ["Sun", "Mon, "Tue", "Wed", "Thu", "Fri", "Sat"]
		for(String x : arr) {
			System.out.println(x);
		}
		
		String n = String.join("-", arr);
		/*
		 * 1st Parameter : "Joining Character"
		 * 2nd Parameter : "Array of Strings"
		 */
		System.out.println(n);
		

	}

}
