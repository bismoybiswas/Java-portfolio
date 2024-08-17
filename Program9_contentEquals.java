package StringPrograms;

public class Program9_contentEquals {

	public static void main(String[] args) {
		String s1 = new String("Classroom");
		String s2 = new String("classroom");
		String s3 = new String("room");
		String s4 = s1; /*s4 is alias of s1.*/
		/*
		 * Here s4 will point the memory reference that is created
		 * by s1.
		 * That means same memory is referred by s1 and s4.
		 * 
		 */
		
		System.out.println(s1.contentEquals(s2));
		System.out.println(s1==s2);
		/* The reference of s1 is not equals to s2
		 * == It will check same reference or not.
		 * s1.contentEquals(s2)
		 * It will check the content are smilar or not.
		 */
		System.out.println(s1.contentEquals(s4));
		System.out.println(s1==s4);
		
		System.out.println(s1.contentEquals(s3));
	}

}
