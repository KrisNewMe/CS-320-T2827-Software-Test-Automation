


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {


	@Test
	public  void testAddContact() {
		ContactService contactService = new ContactService();
		
		Contact ContactOne = new Contact("12345", "Alpha", "Male", "mynumberis", "586 Love My Address");
		Contact ContactTwo = new Contact("543221", "Bravo", "Female", "0987654321", "1650 Love My Address");

		contactService.addContact(ContactOne);
		contactService.addContact(ContactTwo);
		
		List<Contact> listofContacts = contactService.contact();

		assertFalse(listofContacts.isEmpty(), "Contact has been added");
	

	}
	@Test
	public void testDeleteContact() {
		ContactService contactService = new ContactService();
		Contact ContactOne = new Contact("12345", "Alpha", "Male", "mynumberis", "586 Love My Address");
		contactService.deleteContact(ContactOne);
		Contact actualDeleteOne = contactService.deleteContact(ContactOne);

		assertNotEquals(null, ContactOne);
	}
	//Test update function for Values
	@Test
	void updateFirstNameTest() {
	ContactService contactService = new ContactService();
	Contact ContactOne = new Contact("12345", "Alpha", "Male", "mynumberis", "586 Love My Address");
	Contact ContactTwo = new Contact("543221", "Bravo", "Female", "0987654321", "1650 Love My Address");
	contactService.addContact(ContactTwo);
	contactService.updateContact(ContactOne);
	assertNotEquals(ContactTwo.getFirstName(), ContactOne.getFirstName());

}
}
