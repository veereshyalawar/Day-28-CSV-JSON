/**
 * UC1:- Ability to create a Contacts in Address Book with first and last names,
 * address, city, state, zip, phone number and email...
 * 
 * UC2:- Ability to add a new Contact to Address Book
 * 
 * UC3:- Ability to edit existing contact person using their name
 * 
 * @author user -Almas
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
	static ContactDetails person = new ContactDetails();
	/**
	 * Creating a List of ContactDetails of type String using ArrayList here Adding
	 * new elements in the List
	 */
	static List<ContactDetails> contactDetailsList = new ArrayList<ContactDetails>();
	static Scanner scanner = new Scanner(System.in);

	/**
	 * created method addNewContact() to create a new contacts to the AddressBook
	 */
	public void addContact() {
		System.out.println("Enter First Name : ");
		String firstName = scanner.next();
		System.out.println("Enter Last Name : ");
		String lastName = scanner.next();
		System.out.println("Enter Your Address : ");
		String address = scanner.next();
		System.out.println("Enter Your City : ");
		String city = scanner.next();
		System.out.println("Enter Your State");
		String state = scanner.next();
		System.out.println("Enter ZipCode : ");
		int zipCode = scanner.nextInt();
		System.out.println("Enter MobileNumber : ");
		long mobileNumber = scanner.nextLong();
		System.out.println("Enter your EmailId  : ");
		String emailId = scanner.next();

		person = new ContactDetails(firstName, lastName, address, city, state, zipCode, mobileNumber, emailId);
		contactDetailsList.add(person);
		printContact();

	}

	/**
	 * created method printContact() to display the data
	 */
	public void editContact() {
		System.out.println("Enter the first name of person to edit Contact : ");
		String firstName = scanner.next();
		if (firstName.equalsIgnoreCase(person.getFirstName())) {
			addContact();
		} else {
			System.out.println("The Entered First Name Is Not Match");
			editContact();
		}
	}

	/**
	 * Main method for manipulation AddressBookCollection
	 * 
	 * @param args - Default Java @param (Not used)
	 */
	public static void printContact() {
		for (int i = 0; i < contactDetailsList.size(); i++) {
			person = contactDetailsList.get(i);
			System.out.println("Contact Details");
			System.out.println("Name          : " + person.getFirstName() + " " + person.getLastName() + "\n"
					+ "Address       : " + person.getAddress() + "\n" + "City          : " + person.getCity() + "\n"
					+ "State         : " + person.getState() + "\n" + "ZipCode       : " + person.getZipCode() + "\n"
					+ "MobileNumber  : " + person.getMobileNumber() + "\n" + "EmailId       : " + person.getEmailId()
					+ "\n");
		}
	}

}