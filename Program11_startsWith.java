package StringPrograms;

public class Program11_startsWith {

	public static void main(String[] args) {
		String S1 = new String("Classroom");
		System.out.println(S1.startsWith("room"));
		/*
		 * If Classroom starts with room,
		 * output will be true,
		 * else output will be false.
		 */
		System.out.println(S1.startsWith("Class"));
		String s2 = new String("room");
		
		System.out.println("Classroom".startsWith("class"));
		System.out.println("Classroom".startsWith(s2));

	}

}
