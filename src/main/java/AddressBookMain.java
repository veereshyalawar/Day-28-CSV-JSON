/**
 * importing scanner class to take input from console
 */
import java.util.Scanner;

public class AddressBookMain {

	/**
	 * Main method for manipulation AddressBookCollection
	 * 
	 * @param args - Default Java param (Not used)
	 */
	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		/**
		 * from addressBook class calling addcontact method to edit and delete the
		 * contacts
		 */
		addressBook.addContact();
		System.out.println("Enter 1 To Edit The Contact and 2 To Delete The Contact ");
		int choice = scanner.nextInt();
		if (choice == 1) {
			addressBook.editContact();
		} else {
			addressBook.deleteContact();
		}

	}

}