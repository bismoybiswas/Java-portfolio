package ArrayDemo;

import java.util.Scanner;

public class ArrayExample2 {

	public static void main(String[] args) {
		/* Ask User Array Size */
		int size;
		System.out.println("Please mention Array Size: ");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		System.out.println("Array Size : "+size);
		
		/* Define 1D Array */
		int arr[] = new int [size];
		for(int index=0; index<arr.length; index++) {
			System.out.println("\nEnter a Value : ");
			arr[index] = sc.nextInt();
		}
		sc.close();
		System.out.println();
		
		for(int index=0; index <arr.length; index++) {
			System.out.println(arr[index]+" ");
		}
	}

}
