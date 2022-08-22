package Task2;

public class mainMethod {
	
	public static void main(String[] args) {
		String name="Maryam";
		String surname="Gadiali";
		String email="mzg1@student.le.ac.uk";
		Person person = new Person(name, surname, email); 			//Create Person Instance
		Greet.greet(person.getEmail());								//Use greet method on Person instance
		
		emailCollection.addToEmailCollection(person.getEmail());	//Added person's email to emailcollection array
		validateEmails.validateEmail(emailCollection.getEmailCollection()); //Checked all of the emails in the emailcollection array
		
	}

}
