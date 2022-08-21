package Task2;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class validateEmails {
	public static String validateEmail(ArrayList<String> email) { 
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ //got regex from geeksforgeeks website
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
		Pattern pat = Pattern.compile(emailRegex);
		for (Object item : email) {
			boolean matches=false;
			String itemString=item.toString();
			if (itemString == null)
				continue;
			if (pat.matcher(itemString).matches()) {
				matches=true;
			}
			System.out.println(
					itemString +" matches is " +matches);
				
		}
		return null;
		
             
		
			
		}
}

