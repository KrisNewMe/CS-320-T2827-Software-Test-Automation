

public class Contact {

	private String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;

	public Contact (String contactID, String firstName, String lastName, String phone, String address ) {
		if(firstName == null || firstName.length() > 10 ) {
			throw new IllegalArgumentException("Invalid ID");
		}
		if(lastName== null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		if(contactID == null || contactID.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		if(phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactID = contactID;
		this.phone = phone;
		this.address = address;
	}

	public String getContactID() {
		return contactID;
	}

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}


	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

}
