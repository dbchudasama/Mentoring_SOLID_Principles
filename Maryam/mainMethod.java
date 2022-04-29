package Task1;

public class mainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Maryam";
		String surname="Gadiali";
		String email="mzg1@student.le.ac.uk";
		Person person = new Person(name, surname, email);
		Greet.greeting((person.name),(person.surname));
		if(validateEmail.emailValidation(person.email)) {
			System.out.println("Email is valid");
		}
		else {
			System.out.println("Email is not valid");
		}
		
	}

}
