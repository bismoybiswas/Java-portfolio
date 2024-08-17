package CollectionProgram;
import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {

			
		ArrayList<String> days = new ArrayList<String>();
		days.add("Sunday");
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		days.add("Saturday");
			
			
		//To see the whole content of the ArrayList days
		System.out.println(days);
			
		//To see the whole content of the ArrayList days using loop
		for(String s: days) {
			System.out.println(s);
		}
			
		//Remove element using value - First Occurrence Value will be removed
		/*
		 * General Syntax:
		 * ArrayList.remove(Value/Index);
		 */

		
		System.out.println(days.size()); //days.length => days.size()
		System.out.println(days.get(0)); //days[0]     => days.get(0)
		days.remove("Monday");
		System.out.println(days);
	
		//Remove element using index
		days.remove(3);
		System.out.println(days);
		
		//Add element
		days.add(1, "Monday");
		days.add(4, "Thursday");
		System.out.println(days);
		
		//Total elements
		System.out.println("Total Element: "+ days.size());
		
		/*
		 * for(int i=0; i<arr.length; i++){
		 * 	System.out.println(arr[i]);
		 * }
		 */
		for(int i=0; i<days.size(); i++){
			System.out.println(days.get(i));
		}
		
		//To replace an element in a particular index
		//arraylist.set(index,"Element");
		
		days.set(0, "Funday");
		
		System.out.println();
		for(int i=0; i<days.size(); i++){
			System.out.println(days.get(i));
		}
		
		Collections.sort(days);
		
		for(int i=0; i<days.size(); i++){
			System.out.println(days.get(i));
		}
		ArrayList<Integer> numI = new ArrayList<Integer>();
		ArrayList<Double> numD = new ArrayList<Double>();
		numI.add(10);
		numI.add(20);
		numI.add(30);
		numI.add(40);
		for(int i=0; i<numI.size(); i++){
			System.out.println(numI.get(i));
		}
		numD.add(10.8);
		numD.add(20.8);
		numD.add(30.5);
		numD.add(40.9);
		for(int i=0; i<numD.size(); i++){
			System.out.println(numD.get(i));
		}
		
		ArrayList<Float> numF = new ArrayList<Float>();
		numF.add(19.7f);
		numF.add(19.8f);
		ArrayList<Character> numC = new ArrayList<Character>();
		/*
		 	Wrapper Class:
		 	ArrayList<String/Wrapper Class> numC = new ArrayList<String/ Wrapper Class();
		 */
		
		//ArrayList to Array Conversion
		Integer a[] = new Integer[numI.size()];
		a=numI.toArray(a);
		System.out.println();
		for(int i:a) {
			System.out.print(i+" ");
		}
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	
		
		System.out.println(days);
		/*Remove all the elements from days */
		days.removeAll(days);
		System.out.println(days);
		
		days.add("Sunday");
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		days.add("Saturday");
		
		System.out.println(days.contains("Friday"));
		System.out.println(days.contains("Classroom"));
		
		int index=days.indexOf("Friday");
		System.out.println(index);
		
		int lastindex=days.lastIndexOf("Friday");
		System.out.println(lastindex);
		
		System.out.println(days.isEmpty());
		String output = days.toString();
		System.out.println(output);
	}
}
