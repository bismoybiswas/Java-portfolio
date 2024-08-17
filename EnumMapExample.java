package CollectionProgram;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Set;
enum Days{
	Sun, Mon, Tue, Wed
}

public class EnumMapExample {

	public static void main(String[] args) {
		EnumSetExample x = new EnumSetExample();
		System.out.println(x.a);
		Set<EnumSetExample.Colors> set1 = EnumSet.of(EnumSetExample.Colors.Red, EnumSetExample.Colors.Green);
		System.out.println(set1);
		
		EnumMap<Days, String> d = new EnumMap<>(Days.class);
		d.put(Days.Sun, "0");
		d.put(Days.Mon, "1");
		d.put(Days.Tue, "2");
		d.put(Days.Wed, "3");
		
		System.out.println(d.get(Days.Wed));

	}

}
