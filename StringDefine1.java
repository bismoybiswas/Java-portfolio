package StringPrograms;
import java.util.Scanner;
public class StringDefine1 {

	public static void main(String[] args) {
		// Character Array to String Conversion
		// We are defining character array
		char chars[] = {'c', 'l', 'a', 's', 's', 'r', 'o', 'o', 'm'};
		// Converting Character array to String
		String s = new String(chars);
		System.out.println("The String is : "+s);
		
		//String to Character Array Conversion
		String str = "Classroom";
		char t[] = str.toCharArray();
		for(int index=0; index<t.length; index++) {
			System.out.print(t[index]+" ");
		}
		System.out.println();
		
		//How to define String in JAVA?
		
		/* Way 1 */
		char ch[] = {'c', 'l', 'a', 's', 's', 'r', 'o', 'o', 'm'};
		String st1 = new String(ch);
		System.out.println("The String is : "+st1);
		
		/* Way 2 */
		String st2 = "Classroom";
		System.out.println("The String is : "+st2);
		
		/* Way 3 */
		String st3 = new String("Hello");
		System.out.println("The String is : "+st3);
		
		/* Way 4 */
		char arr[] = {65,66,67,68,69}; //ASCII from A to E.
		String st4 = new String(arr);
		System.out.println("The String is : "+st4);
		
		/* Way 5 */
		Scanner sc = new Scanner(System.in);
		
		String st5 = sc.next(); //Word
		System.out.println("The String is : "+st5);
		sc.nextLine(); //Sentence
		String st6 = sc.nextLine();
		System.out.println("The String is : "+st6);
		
		sc.close(); //To Avoid Resource Leak
		
		/* Way 6 : Define String by Anther String*/
		String st7 = new String("Hello");
		String st8 = new String(st7);
		System.out.println("The String is : "+st8);
		
		/* Way 7 : Define String by Another Character Array Partially */
		
		char chN[] = {'c', 'l', 'a', 's', 's', 'r', 'o', 'o', 'm'};
		String st10 = new String(chN,5,4);
	// String st10 = new String(characterArray,StartingIndex,NoOfChars);
		System.out.println("The String is : "+st10);
	}

}
