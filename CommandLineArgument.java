package TakesUserValues;

public class CommandLineArgument {

	public static void main(String[] args) {
		System.out.println("The total no of arguments: "+args.length);
		int a = Integer .parseInt(args[0]);
		System.out.println(a);
		
		float f = Float.parseFloat(args[1]);
		System.out.println(f);
		
		double d = Double.parseDouble(args[2]);
		System.out.println(d);
		
		System.out.println();
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]);
		System.out.println(args[4]);
		
		/*
		 * How to set Arguments?
		 * Click down arrow after Run
		 * -> Run Configurations
		 * -> Set Arguments
		 * -> Click Apply
		 * -> Click Run
		 */
	}
}
