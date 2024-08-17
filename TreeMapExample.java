package CollectionProgram;
import java.util.Map;
import java.util.TreeMap;
public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap <Integer, String> map = new TreeMap<Integer, String>();
		map.put(100, "JAVA");
		map.put(200, "Python");
		map.put(300, "C++");
		map.put(400, "C");
		System.out.println(map.entrySet());
		map.put(400, "Cobol");
		System.out.println(map.entrySet());
		
		/*
		 * If we define map with same key twice,
		 * then last updated value will remain.
		 */
		System.out.println(map.entrySet());
		for(Map.Entry x : map.entrySet()) {
			System.out.println(x.getKey() + " " + x.getValue());
		}

	}

}
