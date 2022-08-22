package Task2;

import java.util.ArrayList;
import java.util.Arrays;

public class emailCollection {
	static ArrayList<String> emailCollectionList = new ArrayList<String>(Arrays.asList(
			"mgadiali@gmail.com",
			"rose@outlook.com",
			"alice@hotmail.com",
			"lucy"));
	
	public static ArrayList<String> getEmailCollection() {
		return emailCollectionList;
	}
	
	public static ArrayList<String> addToEmailCollection(String email) {
		emailCollectionList.add(email);
		return emailCollectionList;
	}
}
