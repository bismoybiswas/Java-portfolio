package TakesUserValues;
import java.io.*;
import java.io.IOException;
public class DataInputStreamExample {

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws NumberFormatException, IOException {
		DataInputStream d = new DataInputStream(System.in);
		/* Integer Input */
		System.out.println("Enter a Integer value: ");
		int x = Integer.parseInt(d.readLine());
		System.out.println(x);
		/* Float Input */
		System.out.println("Enter a float value: ");
		float f = Float.parseFloat(d.readLine());
		System.out.println(f);
		/* Double Input */
		System.out.println("Enter a Double value: ");
		double t = Double.parseDouble(d.readLine());
		System.out.println(t);
		/* String Input */
		System.out.println("Enter a String: ");
		String s = d.readLine();
		System.out.println(s);
		/* Character Input */
		System.out.println("Enter a Character: ");
		char ch = d.readLine().charAt(0);
		System.out.println(ch);
	}

}
