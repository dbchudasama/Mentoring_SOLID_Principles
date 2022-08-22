package Task2;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class validateEmails extends emailCollection {
	
	public static String validateEmail(ArrayList<String> email) { 
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ //got regex from geeksforgeeks website
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
		Pattern pat = Pattern.compile(emailRegex);
		for (Object item : email) {
			boolean matches=false;
			String itemString=item.toString();
			if (pat.matcher(itemString).matches()) {
				matches=true;
			}

			System.out.printf("%25s is a %6s email \n", itemString, matches);
				
		}
		return null;
		
             
		
			
		}
}

