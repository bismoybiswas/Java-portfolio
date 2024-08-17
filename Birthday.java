package Static_Programs;

public class Birthday {

	static int cake = 1000;
	/*
	 * What is static data member?
	 * Static data member is a class variable
	 * that is shared between all the objects
	 * and class itself.
	 * 
	 * Static Data Member does not depend upon object creation.
	 * If object is not created but static data member is declared,
	 * then also Static data member can be accessed by the Class.
	 * 
	 * What is instance variable?
	 * The data members that needs to created for each objects.
	 * 
	 * Instance Variable can not be accessed before object creation.
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("The quantity of cake: " + Birthday.cake);
		/*
		 * We have not created any object still now.
		 * but we are trying to acecess static data member by class name.
		 */
		Birthday Nilanjan = new Birthday();
		Nilanjan.cake -=100;
		System.out.println("The quantity of cake by Class Name: " + Birthday.cake);
		System.out.println("The quantity of cake by Object Name: " + Nilanjan.cake);
		/*
		 * Nilanjan is an object of class Birthday.
		 * Now Nilanjan modifies the value of the static data member cake.
		 * 
		 * As cake is a static variable and sharable between
		 * objects and the class,
		 * then that changes can be accessed by objects and class.
		 * 
		 */
		Birthday Putul = new Birthday();
		Putul.cake -= 50;
		System.out.println("The quantity of cake: " + Birthday.cake);
		Birthday Satyaki = new Birthday();
		System.out.println("The quantity of cake: " + Satyaki.cake);
		Putul.cake -= 850;
		System.out.println("The quantity of cake: " + Birthday.cake);
		
		System.out.println("The quantity of cake Nilanjan: " + Nilanjan.cake);
		System.out.println("The quantity of cake Satyaki: " + Satyaki.cake);
		System.out.println("The quantity of cake Putul: " + Putul.cake);
		
		

	}

}
