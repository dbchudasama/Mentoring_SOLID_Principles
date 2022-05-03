package Task1;
public class Greet extends Person {

	public Greet(String n, String sn, String e) {
		super(n, sn, e);
		
	}

	public static void greet() {
		System.out.println("Hello "+ name + " " + surname);
	}
}
