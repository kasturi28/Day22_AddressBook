import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author kastu
 *
 */
public class AddressBookMethod {
	/**
	 * Importing scanner function for taking inputs from the user for contact details
	 * Defining arraylist of contact as list
	 * taking inputs from user
	 * printing tha same in an array form
	 */
	Scanner sc = new Scanner(System.in);
    ArrayList<Contact> list = new ArrayList<>();

    public void newContact(){
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
	
	
}