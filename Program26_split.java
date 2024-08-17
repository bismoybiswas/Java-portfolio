package StringPrograms;

public class Program26_split {

	public static void main(String[] args) {
		
		String s1 = new String("Sun, Mon, Tue, Wed, Thu, Fri, Sat");
		System.out.println(s1);
		
		String arr[] = s1.split(", ");
		//["Sun", "Mon, "Tue", "Wed", "Thu", "Fri", "Sat"]
		for(String x : arr) {
			System.out.println(x);
		}
		
		System.out.println();
		String s2 = new String("Sun-Mon-Tue-Wed Thu Fri Sat");
		String ar[] = s2.split("-");
		//["Sun", "Mon", "Tue", "Wed Thu Fri Sat"]
		for(String x : ar) {
			System.out.println(x);
		}

	}

}
