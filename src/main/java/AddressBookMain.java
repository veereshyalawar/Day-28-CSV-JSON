/**
 * importing scanner class to take input from console
 */
import java.util.Scanner;

public class AddressBookMain {

	/**
	 * Main method for manipulation AddressBookCollection
	 * 
	 * @param args - Default Java @param (Not used)
	 */
	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		/**
		 * from addressBook class calling addcontact method to edit the contacts
		 */
		addressBook.addContact();
		System.out.println("Enter Y To Edit The Contact");
		String choice = scanner.nextLine();
		if (choice.equals("y") || choice.equals("Y")) {
			addressBook.editContact();
		}

	}

}