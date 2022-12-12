import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContactService {
	private List<Contact> listofContacts = new ArrayList<>();
	public List<Contact> contact() {
		return Collections.unmodifiableList(listofContacts);
	}

	public  void addContact(Contact contact) {
		listofContacts.add(contact);
	}
	public Contact deleteContact(Contact deletingContact) {
		for(int i = 0; i<listofContacts.size(); i++) {
			Contact c = listofContacts.get(i);
			String id = c.getContactID();
			if(id.equals(c)) {
				listofContacts.remove(i);
			}
		}
		return deletingContact;
	}
	public void updateContact(Contact contactId) {
	
		for(int i = 0; i<listofContacts.size(); i++) {
			Contact updateAddress = listofContacts.get(i);
			Contact updatefirstName = listofContacts.get(i);
			Contact updatelastName = listofContacts.get(i);
			Contact updateNumber = listofContacts.get(i);
			String address = updateAddress.getAddress();
			String firstName = updatefirstName.getFirstName();
			String lastName = updatelastName.getLastName();
			String phone = updateNumber.getPhone();
			if(address.equals(contactId)) {
				listofContacts.set(i, updateAddress);
			}
			if(firstName.equals(contactId)) {
				listofContacts.set(i, updatefirstName);
			}
			if(lastName.equals(contactId)) {
				listofContacts.set(i, updatelastName);
			}
			if(phone.equals(contactId)) {
				listofContacts.set(i, updateNumber);
			}
		}
		}



}
