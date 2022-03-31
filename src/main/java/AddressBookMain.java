
/**
 * importing scanner class to take input from console
 */
import java.util.*;

public class AddressBookMain {

	/**
	 * create method choose() to select any of the option
	 */
	public void choose() {
		MultipleAddressBook obj1 = new MultipleAddressBook();
		AddressBook obj2 = new AddressBook();
		while (true) {
			System.out.println(
					"Enter \n 1. To add The new AddressBook\n 2. To do AddressBook functions\n 3. To delete the AddressBook\n "
							+ "4. To Print the AddressBook\n 5. To Print the contacts in AddressBook\n 6. To show search options\n 0. to exit");
			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				obj1.addAddressBook();
				break;
			case 2:
				obj1.addressBookFunctions();
				break;
			case 3:
				obj1.deleteBook();
				break;
			case 4:
				obj1.printBook();
				break;
			case 5:
				obj1.printContactsInBook();
				break;
			case 6:
				obj2.searchByOptions();
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Enter the wrong input");
			}
		}
	}

	/**
	 * Main method for manipulation AddressBookCollection
	 * 
	 * @param args - Default Java param (Not used)
	 */
	public static void main(String[] args) {
		AddressBookMain addressBookMain = new AddressBookMain();
		addressBookMain.choose();
	}
}