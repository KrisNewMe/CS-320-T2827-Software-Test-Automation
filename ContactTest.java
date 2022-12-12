



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("1234", "Kris", "Collis", "1234567890", "1234 My Address");
		assertTrue(contact.getContactID().equals("1234"));
		assertTrue(contact.getFirstName().equals("Kris"));
		assertTrue(contact.getLastName().equals("Collis"));
		assertTrue(contact.getPhone().equals("1234567890"));
		assertTrue(contact.getAddress().equals("1234 My Address"));

	}
	@Test
	void testContactIDToLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123412312313", "Kris", "Collis", "1234567890", "1234 My Address");
		});
	}
		@Test
		void testContactIDNull() {
			assertThrows(IllegalArgumentException.class, () -> {
				new Contact(null, "Kris", "Collis", "1234567890", "1234 My Address");
			});
	}
		@Test
		void testContactFirstNameToLong() {
			assertThrows(IllegalArgumentException.class, () -> {
				new Contact("1234", "Kristophercollis", "Collis", "1234567890", "1234 My Address");
			});
	}
		@Test
		void testContactFirstNameNull() {
			assertThrows(IllegalArgumentException.class, () -> {
				new Contact("1234",null, "Collis", "1234567890", "1234 My Address");
			});
	}
		@Test
		void testContactLastNameToLong() {
			assertThrows(IllegalArgumentException.class, () -> {
				new Contact("1234", "kristoper", "Colliskristopher", "1234567890", "1234 My Address");
			});
	}
		@Test
		void testContactLastNameNull() {
			assertThrows(IllegalArgumentException.class, () -> {
				new Contact("1234", "Kris", null, "1234567890", "1234 My Address");
			});
	}
		@Test
		void testContactPhoneDoesNotEqualTen() {
			assertThrows(IllegalArgumentException.class, () -> {
				new Contact("1234", "Kris", "Collis", "12345678901", "1234 My Address");
			});
	}
		@Test
		void testContactPhoneNull() {
			assertThrows(IllegalArgumentException.class, () -> {
				new Contact("1234", "Kris", "Collis", null, "1234 My Address");
			});
	}
		@Test
		void testContactAdressToLong() {
			assertThrows(IllegalArgumentException.class, () -> {
				new Contact("1234", "Kris", "Collis", "1234567890", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
			});
	}
		@Test
		void testContactAdressNull() {
			assertThrows(IllegalArgumentException.class, () -> {
				new Contact("1234", "Kris", "Collis", "1234567890", null);
			});
	}
	

}
