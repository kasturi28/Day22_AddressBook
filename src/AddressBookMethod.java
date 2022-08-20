import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author kastu
 *
 */
public class AddressBookMethod {
	/**
	 * Importing scanner function for taking inputs from the user for contact
	 * details Defining arraylist of contact as list taking inputs from user
	 * printing tha same in an array form
	 */
	Scanner sc = new Scanner(System.in);
	ArrayList<Contact> list = new ArrayList<>();

	public void newContact() {

		System.out.println("Enter first name");
		String firstName = sc.nextLine();

		System.out.println("Enter last name");
		String lastName = sc.nextLine();

		System.out.println("Enter address");
		String address = sc.nextLine();

		System.out.println("Enter city");
		String city = sc.nextLine();

		System.out.println("Enter state");
		String state = sc.nextLine();

		System.out.println("Enter zip");
		long zip = sc.nextLong();

		System.out.println("Enter mobileNumber");
		long mobileNumber = sc.nextLong();

		Contact contact = new Contact(firstName, lastName, address, city, state, zip, mobileNumber);

		list.add(contact);

	}

	/**
	 * Defining editcontact method for edit the contact details vy using if else
	 * loop taking new inputs from the user and store then in list
	 */
	public void editContact() {
		System.out.println("enter first name to edit the contact ");

		String name = sc.next();

		for (Contact cThrough : list) {

			if ((name).equals(cThrough.getFirstName())) {

				System.out.println("Which detail you want to edit");
				System.out.println("press 1 for address");
				System.out.println("press 2 for  city");
				System.out.println("press 3 for state");
				System.out.println("press 4 for zip");
				System.out.println("Press 5 for mobile number");

				String choice = sc.next();

				switch (choice) {
				case "1":
					System.out.println("Enter new address ");
					cThrough.setAddress(sc.next());
					break;
				case "2":
					System.out.println("Enter new city ");
					cThrough.setCity(sc.next());
					break;
				case "3":
					System.out.println("Enter new state ");
					cThrough.setState(sc.next());
					break;
				case "4":
					System.out.println("Enter new zip ");
					cThrough.setZip(sc.nextLong());
					break;
				case "5":
					System.out.println("Enter new mobile number");
					cThrough.setmobileNumber(sc.nextLong());
				default:
					System.out.println("Please make a valid choice ");
				}
			} else {
				System.out.println(name + " not found in the address-book");
			}
		}
	}

	/**
	 * Defining deleteContact method for deleting contact from the address book
	 * printing the updated list accordingly
	 */
	public void deleteContact() {
		System.out.println("Enter first name to delete the contact ");
		String name2 = sc.next();
		int index = 0;
		for (Contact con : list) {
			if (con.getFirstName().equals(name2)) {
				list.remove(index);
				break;
			}
			index++;
		}
	}

}