package ArrayDemo;

import java.util.Scanner;

public class ArrayExample1 {

	public static void main(String[] args) {
		/*
		 * Java array is an object which contains elements of a similar
		 * data type: Additionally.
		 * The elements of an array are stored in a contiguous memory location.
		 * It is a data structure where we store similar elements.
		 * We can store only a fixed set of element on Java Array. 
		 */
		/* Process 1 : Hard code Value*/
		int arr[] = {10,20,30,40,50};
		System.out.println("The lenght of array: "+arr.length);
		/*How to Print the Values */
		/*Way : 1*/
		System.out.println("Way 1");
		for (int value : arr) {
			System.out.println(value+" ");
		}
		/* Way : 2 */
		System.out.println("\nWay 2");
		for(int index=0; index<arr.length; index++) {
			System.out.println(arr[index]+" ");
		}
		/* Process 2 - Define Array form user input */
		Scanner sc = new Scanner(System.in);
		for (int index=0; index<arr.length;index++) {
			System.out.println("\nEnter a Value: ");
			arr[index]= sc.nextInt();
		}
		sc.close();
		System.out.println();
		for (int index=0; index <arr.length; index++) {
			System.out.println(arr[index]+" ");
		}
	}

}
