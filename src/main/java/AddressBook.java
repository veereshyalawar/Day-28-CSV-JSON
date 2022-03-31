/**
 * UC1:- Ability to create a Contacts in Address Book with first and last names,
 *       address, city, state, zip, phone number and email...
 * 
 * UC2:- Ability to add a new Contact to Address Book
 * 
 * UC3:- Ability to edit existing contact person using their name
 * 
 * UC4:- Ability to delete a person using person's name
 * 
 * UC5:- Ability to add multiple person to Address Book
 * 
 * UC6:- Refactor to add multiple Address Book to the System. 
 *       Each Address Book has a unique Name - Use Console to add new Address Book 
 *       Maintain Dictionary of Address Book Name
 *
 * UC7:- Ability to ensure there is no Duplicate Entry of the same Person in a 
 *       particular Address Book
 * 
 * @author user -Veeresh
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

	ContactDetails person = new ContactDetails();
	List<ContactDetails> contactDetailsList = new ArrayList<ContactDetails>();
	Scanner scanner = new Scanner(System.in);

	/*
	 * Declaring The Add Contact Method And Entering The Contact Details By Using
	 * Scanner Class And Printing The Contact Details Of Person
	 */
	public void addContact() {
		System.out.println("Enter the number of contacts you want to enter");
		int number = scanner.nextInt();
		for (int i = 0; i < number; i++) {

			/**
			 * checking the duplicate contact by contact name.
			 */
			System.out.println("Enter the first name of person");
			String fName = scanner.next();
			if (fName.equals(person.getFirstName())) {
				System.out.println("The entered person is already exist.");
			} else {
				System.out.println("Enter the contact details of person ");
				writeContact();
				System.out.println("contact added Successfully");
			}
		}
	}

	/**
	 * created method writeContact() to create a new contacts to the AddressBook
	 */
	public void writeContact() {
		System.out.println("Enter First Name : ");
		String firstName = scanner.next();
		System.out.println("Enter Last Name : ");
		String lastName = scanner.next();
		System.out.println("Enter Address : ");
		String address = scanner.next();
		System.out.println("Enter City : ");
		String city = scanner.next();
		System.out.println("Enter State : ");
		String state = scanner.next();
		System.out.println("Enter ZipCode : ");
		int zipCode = scanner.nextInt();
		System.out.println("Enter Mobile Number : ");
		long mobileNumber = scanner.nextLong();
		System.out.println("Enter EmailId : ");
		String emailId = scanner.next();
		person = new ContactDetails(firstName, lastName, address, city, state, zipCode, mobileNumber, emailId);
		contactDetailsList.add(person);

	}

	/**
	 * Declaring The Edit Contact Method TO Edit The Details Of Contact The Details
	 * Of Contact Edit By Using FirstName If First Name Is Match The Contact Will
	 * Edit
	 */
	public void editContact() {
		System.out.println("Enter the first name of person to edit contact");
		String editName = scanner.next();
		boolean edited = false;
		for (int i = 0; i < contactDetailsList.size(); i++) {
			String name = contactDetailsList.get(i).getFirstName();
			if (name.equalsIgnoreCase(editName)) {
				contactDetailsList.remove(person);
				writeContact();
				edited = true;
				break;
			}
		}
		if (!edited) {
			System.out.println("enter name is incorrect");
		}
	}

	/**
	 * Declaring Delete Contact Method TO delete The Details Of Contact The Details
	 * Of Contact Delete By Using FirstName If First Name Is Match Then Contact Will
	 * Delete
	 */
	public void deleteContact() {
		System.out.println("Enter the first name of person to delete contact");
		String deleteName = scanner.next();
		int i = 0;
		for (; i < contactDetailsList.size(); i++) {
			String name = contactDetailsList.get(i).getFirstName();
			if (name.equalsIgnoreCase(deleteName)) {
				break;
			}
		}
		if (i < contactDetailsList.size()) {
			contactDetailsList.remove(i);
			System.out.println("Contact Deleted");
			System.out.println("Remaining contacts in the book igsit");
		} else {
			System.out.println("Contact not find");
		}

	}

}