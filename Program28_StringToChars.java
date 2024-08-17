package StringPrograms;

public class Program28_StringToChars {

	public static void main(String[] args) {
		String str = new String("Classroom");
		
		/* Convert String to Character Array*/
		char arr[] = str.toCharArray();
		
		System.out.println(arr);
		
		/*Process 1 : Modification not possible though index */
		for ( char element : arr) {
			System.out.println(element);
		}
		
		/*Process 2 : Modification possible though index */
		for(int i = 0; i<arr.length; i++) {
			System.out.println("Index : "+i);
			System.out.println("Element : "+arr[i]);
		}
		
		String newstr = new String(arr);
		System.out.println(newstr);
	}

}
/*
 * int arr[] ={10,20,30};
 * arr[0] = 10;
 * arr[1] = 20;
 * arr[2] = 30;
 */
