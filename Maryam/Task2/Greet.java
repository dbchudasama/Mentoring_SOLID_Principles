package Task2;
public class Greet extends Person {

	public Greet(String n, String sn, String e) {
		super(n, sn, e);
		
	}

	public static void greet(String email) {
		System.out.println("Hello "+ name + " " + surname);
		System.out.println("Your email is " + email);
	}
}
