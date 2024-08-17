package ArrayDemo;
import java.util.Scanner;
public class RaggedArray {
	/*
 		Ragged Array
 		No of Columns will be different in the rows for the array.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int totalRows = sc.nextInt();
		int arr[][] = new int[totalRows][];
		/*
		 * In ragged array as we are sure about the total number of rows,
		 * But are not sure about total number of columns,
		 * for that reason,
		 * We are defining array
		 * like this:
		 * new int[totalRows][]
		 * totalCols missing,
		 * 
		 * If we write totalrows = 4
		 * totalCols = 5
		 * Then Array will 4*5
		 * that means for each row total no of cols = 5		 
		 */
		for(int r=0; r<totalRows; r++) {
			/*As no of col differs in each row */
			System.out.println("Total no you cols you want to use : ");
			int totalCols = sc.nextInt();
			/*
			 * As we know in java,
			 * we may treat each row of 2D array as
			 * 1D array.
			 * S, In Ragged array as col number differs,
			 * we have to define the arrays row wise.
			 */
			arr[r] = new int[totalCols];
			
			for(int c = 0; c<arr[r].length; c++) {
				/*User - Input */
				System.out.println("Enter the value : ");
				arr[r][c] = sc.nextInt();
			}
		}
		
		for(int r=0; r<arr.length; r++) {
			for(int c =0; c<arr[r].length; c++) {
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
		sc.close();

	}

}
