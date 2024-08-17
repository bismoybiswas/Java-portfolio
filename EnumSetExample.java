package CollectionProgram;
import java.util.EnumSet;
import java.util.Set;


public class EnumSetExample {
	enum Colors{
		Red, Blue, Green, Yellow;
	}
	int a;
	public static void main(String[] args) {
		
		Set<Colors> set1 = EnumSet.of(Colors.Red, Colors.Green);
		System.out.println(set1);
		System.out.println(Colors.Red);
		
		
		Set<Colors> set2 = EnumSet.allOf(Colors.class);
		System.out.println(set2);
		
		Set<Colors> set3 = EnumSet.noneOf(Colors.class);
		System.out.println(set3);

	}

}
