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
		 * for new contact printing the deails in a list form Taking inputs from the
		 * user to create new contact or edit existing contact calling the methods
		 * accordingly printing the final list taking 3rd input from the user for
		 * deketing the contact from the address book printing the updatdd list
		 */
		System.out.println("Welcome to Address book program.... ");
		MultipleAddressBook obj = new MultipleAddressBook();

        while (true) {
            System.out.println("Enter \n 1. Add  new AddressBook\n 2. Add contact in AddressBook\n "
                    + "3. edit the contact in AddressBook\n 4. delete the contact in AddressBook\n 5. delete the AddressBook\n "
                    + "6. Print the AddressBook\n 7. Print the contacts in AddressBook\n 0. To exit");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    obj.addAddressBook();
                    break;
                case 2:
                    obj.addContact();
                    break;
                case 3:
                    obj.editContactInBook();
                    break;
                case 4:
                    obj.deleteContactInBook();
                    break;
                case 5:
                    obj.deleteAddressBook();
                    break;
                case 6:
                    obj.printBook();
                    break;
                case 7:
                    obj.printContactsInBook();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter the wrong input");
            }
        }
    }
		

}
