package ArrayDemo;

public class Array2DArrayExample {

	public static void main(String[] args) {
		/*2D Array Define */
		int arr[][] = {
				{10,20,30},
				{40,50,60}
		};
		System.out.println("Total Rows : "+ arr.length);
		System.out.println("No of cols in 1st row: "+arr[0].length);
		System.out.println("No of cols in 2nd row: "+arr[1].length);
		
		/*
		 * In java,
		 * for each row,
		 * the number of cols may differ in 2D Array.
		 * And this type of concept is known as ragged array.
		 */
		
		for(int row=0;row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}

	}

}
