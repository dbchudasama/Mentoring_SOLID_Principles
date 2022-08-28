package Tattel.io;

//inheritance
public class Greet extends Person{
	
	
	// note to self, this was all auto generated lmao
	public Greet(String f, String s, String e) {
		super(f, s, e);
		// TODO Auto-generated constructor stub
	}
	
	// program wanted it to be static and void, i have no clue why lol
	public static void greet_user() {
		System.out.println("Greetings!" + forename + surname);
	}

}
