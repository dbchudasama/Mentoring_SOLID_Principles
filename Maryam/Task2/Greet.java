package Task2;
public class Greet extends Person {

	public Greet(String n, String sn, String e) {
		super(n, sn, e);
		
	}

	public static void greet(String email) { //matches the requirement
		System.out.println("Hello "+ name + " " + surname);
		System.out.println("Your email is " + email);
	}
	
	public static void greet() { //uses the super constructor to get email attribute value
		System.out.println("Hello "+ name + " " + surname);
		System.out.println("Your email is " + email);
	}
}
