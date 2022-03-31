
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
		Scanner scanner = new Scanner(System.in);
		/**
		 * while condition is taken to check the condition is it is true enters to the
		 * switch case statement
		 */
		while (true) {
			System.out.println(
					"Enter \n 1 To add The contact \n 2 To edit the contact \n 3 To delete the contact \n 4 to exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				addressBook.addContact();
				break;
			case 2:
				addressBook.editContact();
				break;
			case 3:
				addressBook.deleteContact();
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Enter the wrong input");
				continue;
			}

		}

	}

}