package Task2;

import java.util.ArrayList;
import java.util.Arrays;

public class emailCollection {
	static ArrayList<String> emailCollection = new ArrayList<String>(Arrays.asList(
			"mgadiali@gmail.com",
			"rose@outlook.com",
			"alice@hotmail.com",
			"lucy"));
	
	public static ArrayList<String> getEmailCollection() {
		return  emailCollection;
	}
	
	public static ArrayList<String> addToEmailCollection(String email) {
		emailCollection.add(email);
		return emailCollection;
	}
}
