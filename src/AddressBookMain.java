
public class AddressBookMain {
	/**
	 * 
	 * @param args
	 */
	 public static void main(String[] args) {
		 /*
		  * Printing welcome message
		  * Defining object of addressbookmethod
		  * calling method for new contact
		  * printing the deails in a list form
		  */
	        System.out.println("Welcome to Address Book Program... ");

	        AddressBookMethod addressBookMethod = new AddressBookMethod();
	        addressBookMethod.newContact();

	        System.out.println(addressBookMethod.list);

}
}
