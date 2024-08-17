package StringPrograms;

public class Program7_concat {

	public static void main(String[] args) {

		String s1 = new String("JAVA");
		String s2 = new String("Python");
		String s3 = new String("PHP");
		
		/*Process 1 - To concatenate 2 strings */
		System.out.println(s1.concat(s2));
		/*Process 2 - To concatenate 2 strings */
		System.out.println(s1+s2);
		/*
		 * (Using + Operator)
		 * + operator generally works b/w 2 numbers.
		 * but here it performs different action like
		 * String concatenation b/w 2 strings.
		 * So, here + operator is example of operator overloaded.
		 */
		System.out.println(s1.concat(s2).concat(s3));
		System.out.println(s1+s2+s3);
		
		//System.out.println(s1.concat("10").concat(20)); // Integer not allowed
		System.out.println(s1+10+20); 					//Integer Allowed
		System.out.println(10+20+s1);
		System.out.println(10+20+s1+10+20);
		System.out.println(10*20+s1+10+20);
		System.out.println(10-20+s1+10+20);
		//System.out.println(s1+10+20+s2);
		System.out.println(s1+10+20+s2);
		System.out.println(s1+(10+20)+s2);
	}

}
