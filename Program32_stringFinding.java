package StringPrograms;

public class Program32_stringFinding {

	public static void main(String[] args) {
		String s1 ="abcdefgh";
		String s2 = "ab";
		
		int found =0;
		int range = s1.length()-s2.length();
		
		for(int i=0; i<=range; i++) {
			String temp = (String) s1.subSequence(i, i+s2.length());
			
			//0,2 | 1,3| .....6,8
			System.out.println(  temp  );
			
			if(temp.equals(s2)) {
				found++;
				//break;
			}
		}
		
		System.out.println(found);
		if(found>=1)
			System.out.println("Found");
		else
			System.out.println("Not Found");
		
		

	}

}
