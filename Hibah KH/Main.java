package Tattel.io;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter forename: ");  
		String forename= sc.nextLine();  
		
		System.out.print("Enter surname: ");  
		String surname= sc.nextLine(); 
		
		System.out.print("Enter email address ");  
		String email= sc.nextLine();
		
		Person person = new Person(forename, surname, email);
		
		//output for the entire program
		Greet.greet_user();
		if(ValidateEmail.isValidEmailAddress(person.email)) {
			System.out.println("Your provided email is valid");
		}
		else {
			System.out.println("Your provided email is not valid");
		}

	}

}
