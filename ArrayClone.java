package ArrayDemo;

public class ArrayClone {

	public static void main(String[] args) {
		int arr1[] = {10,20,30,40,50};
		int arr2[] = new int[10];
		
		for(int element : arr1) {
			System.out.print(element+" ");
		}
		System.out.println();
		System.out.println(arr2.length);
		arr2 = arr1.clone();
		System.out.println(arr2.length);
		
		/*
		 If we create clone of one dimensional array in java,
		 then it will follow deep copy of that array within another
		 one.
		 arr1: 5
		 arr2: 10
		 
		 arr2 <--arr1
		 10<---5
		 5
		 
		 */
		for (int element : arr2) {
			System.out.print(element+" ");
		}
		arr1[0]=15;
		System.out.println("\narr1 : ");
		for(int element : arr1) {
			System.out.print(element+" ");
		}
		System.out.println("\narr2 : ");
		for(int element : arr2) {
			System.out.print(element+" ");
		}
		int arr3[] = new int[5];
		arr3 = arr1;
		/*Here arr3 and arr1 both indicates same memory.
		 * here arr3 is the alias name of arr1.
		 */
		System.out.println("\narr3 : ");
		for(int element : arr3) {
			System.out.print(element+" ");
		}
		arr1[2]=55;
		
		System.out.println("\narr3 : ");
		for(int element : arr3) {
			System.out.print(element+" ");
		}
		System.out.println("\narr1 : ");
		for (int element : arr1) {
			System.out.print(element+" ");
		}
	}

}
