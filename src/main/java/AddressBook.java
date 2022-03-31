/**
 * UC1:- Ability to create a Contacts in Address Book with first and last names,
 * address, city, state, zip, phone number and email...
 * 
 * UC2:- Ability to add a new Contact to Address Book
 * 
 * UC3:- Ability to edit existing contact person using their name
 * 
 * UC4:- Ability to delete a person using person's name
 * 
 * UC5:- Ability to add multiple person to Address Book
 * 
 * @author user -Almas
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

	/**
	 * Creating a List of ContactDetails of type String using ArrayList here Adding
	 * new elements in the List
	 */
	List<ContactDetails> contactDetailsList = new ArrayList<ContactDetails>();
	Scanner scanner = new Scanner(System.in);

	/**
	 * Declaring The Add Contact Method And Entering The Contact Details By Using
	 * Scanner Class And Printing The Contact Details Of Person
	 */
	public void addContact() {
		System.out.println("Enter the number of contacts you want to enter");
		int number = scanner.nextInt();
		for (int i = 0; i < number; i++) {
			System.out.println("Enter the contact details of person ");
			writeContact();
		}
	}

	/**
	 * created method writeContact() to create a new contacts to the AddressBook
	 */
	public void writeContact() {
		ContactDetails person = new ContactDetails();
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
		printContact();
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
			System.out.println("Remaining contacts in the book isgit");
			printContact();
		} else {
			System.out.println("Contact not find");
		}

	}

	/**
	 * created method printContact() to display all the contacts
	 */
	public void printContact() {
		for (int i = 0; i < contactDetailsList.size(); i++) {
			System.out.println("Contact Details");
			System.out.println("Name         : " + contactDetailsList.get(i).getFirstName() + " "
					+ contactDetailsList.get(i).getLastName() + "\n" + "Address      : "
					+ contactDetailsList.get(i).getAddress() + "\n" + "City         : "
					+ contactDetailsList.get(i).getCity() + "\n" + "State        : "
					+ contactDetailsList.get(i).getState() + "\n" + "ZipCode      : "
					+ contactDetailsList.get(i).getZipCode() + "\n" + "MobileNumber : "
					+ contactDetailsList.get(i).getMobileNumber() + "\n" + "EmailId      : "
					+ contactDetailsList.get(i).getEmailId() + "\n");
		}
	}
}