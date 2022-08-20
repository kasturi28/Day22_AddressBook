import java.util.Scanner;

public class AddressBookMain {
	/**
	 * 
	 * @param args
	 */
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * Printing welcome message Defining object of addressbookmethod calling method
		 * for new contact printing the deails in a list form
		 * Taking inputs from the user to create new contact or edit existing contact
		 * calling the methods accordingly
		 * printing the final list
		 */
		System.out.println("Welcome to Address book program.... ");
		
		AddressBookMethod addressBookMethod = new AddressBookMethod();
		addressBookMethod.newContact();
		
		System.out.println("Enter your choice");
		System.out.println("Press 1 for new contact");
		System.out.println("Press 2 for edit contact");
		int x = scanner.nextInt();
	
	
		if (x == 1) {
			addressBookMethod.newContact();
			System.out.println(addressBookMethod.list);
		} else if (x == 2) {
			addressBookMethod.editContact();
		} else {
			System.out.println("Thanks for using this Address-book");
		}
		System.out.println(addressBookMethod.list);

	}

}
