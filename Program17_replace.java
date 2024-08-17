package StringPrograms;

public class Program17_replace {

	public static void main(String[] args) {
		String s1 = new String("ClassPlus");
		String s2 = new String("room");
		
		String s3 = s1.replace("Plus", s2);
		System.out.println(s3);
		/*
		 s1.replace("Plus", s2)
		 "ClassPlus".replace("Plus", s2);
		 "ClassPlus".replace("Plus", room);
		 Classroom
		 
		  Here
		  String1 contains "ClassPlus"
		  String2 contains "room"
		 
		  s1.replace("Plus", s2) => It will not modify s1.
		  It will return new String reference.
		  
		  If you wish to modify s1,
		  then you may write,
		  s1 = s1.replace("Plus", s2);
		 */
		
		String s4 = new String("ClassPlusPlusPlus");
		String s5 = s4.replace("Plus", s2);
		/*
		 	"ClassPlusPlusPlus".replace("Plus", "room")
		 	Classroomroomroom
		 */
		System.out.println(s5);
		String s6 =s4.replaceFirst("Plus", "room");
		System.out.println(s6);
		
		char arr[] = "Classroom".toCharArray();
		arr[0] = 'R';
		System.out.println(arr[0]);
		String s = new String(arr);
		System.out.println(s);
	}

}
