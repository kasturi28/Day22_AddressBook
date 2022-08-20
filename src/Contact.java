
public class Contact {
/**
 * Defining contact details
 * Taking getters & setters for the same
 * Genarating toString of the deatails
 */
	private String firstName, lastName, address, city, state;
	private long zip, mobileNumber;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getZip() {
		return zip;
	}

	public void setZip(long zip) {
		this.zip = zip;
	}
	
	public long getmobileNumber() {
		return mobileNumber;
	}

	public void setmobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	Contact() {
	}

	public Contact(String firstName, String lastName, String address, String city, String state, long zip, long mobileNumber) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Contact{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", address='"
				+ address + '\'' + ", city='" + city + '\'' + ", state='" + state + '\'' + ", zip='" + zip + '\'' + ", mobilenumber ='" + mobileNumber + '\'' +'}';
	}
}
