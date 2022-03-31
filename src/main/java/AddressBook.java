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
 * UC6:- Refactor to add multiple Address Book to the System. 
 * Each Address Book has a unique Name - Use Console to add new Address Book 
 * - Maintain Dictionary of Address Book Name
 * 
 * UC7:- Ability to ensure there is no Duplicate Entry of the same Person in a particular
 * Address Book
 * 
 * UC8:- Ability to search Person in a City or State across the multiple AddressBook
 * 
 * UC9:- Ability to view Persons by City or State 
 * 
 * UC10:- Ability to get number of contact persons i.e. count by City or State
		- Search Result will show count by city and by state by using java streams
		
 * UC11:- Ability to sort the entries in the address book alphabetically by Person�s name
 * @author user -Veeresh
 *
 */

import java.util.*;
import java.util.stream.Collectors;

public class AddressBook {

	/**
	 * creating person object of contactDetails class
	 */
	ContactDetails person = new ContactDetails();
	/**
	 * Creating a List of ContactDetails using ArrayList
	 */
	List<ContactDetails> contactDetailsList = new ArrayList<>();

	/**
	 * Declaring The Add Contact Method And Entering The Contact Details By Using
	 * Scanner Class And Printing The Contact Details Of Person
	 */
	public void addContact() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of contacts you want to enter");
		int number = scanner.nextInt();
		/**
		 * for loop will use if we enter the number of contacts that number of times the
		 * for loop will execute
		 */
		for (int i = 0; i < number; i++) {

			/**
			 * checking the duplicate contacts of person by contact first name because there
			 * is no Duplicate Entry of the same Person in a particular Address Book
			 */
			System.out.println("Enter the first name of person");
			String fName = scanner.next();
			/**
			 * if else condition is used to check the same person is exist or not
			 */
			if (fName.equals(person.getFirstName())) {
				System.out.println("The entered person is already exist. Enter new name");
			} else {
				System.out.println("Enter the contact details of person ");
				/**
				 * calling method wrireContact() to enter all the contact details
				 */
				writeContact();
				System.out.println("contact added Successfully");
			}
		}
	}

	/**
	 * created method writeContact() to create a new contacts to the AddressBook
	 */
	public void writeContact() {
		Scanner scanner = new Scanner(System.in);
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
		/**
		 * storing or adding all the contactDetails to the person
		 */
		person = new ContactDetails(firstName, lastName, address, city, state, zipCode, mobileNumber, emailId);
		contactDetailsList.add(person);
	}

	/**
	 * create method searchByName that is Ability to search Person across the
	 * multiple AddressBook by name
	 * 
	 * @param name -passing name
	 */
	public void searchByName(String name) {
		/**
		 * creating Stream from list of contactDetails. Filter operation produces a new
		 * stream that contains elements of the original stream that pass a given
		 * test(specified by a Predicate). filter(),is a Intermediate operations return
		 * a new stream on which further processing can be done. here filter is used to
		 * search particular name of a person and the filtered stream is creates a list
		 * and will collect in a contactDetails using collector
		 */
		List<ContactDetails> collect = contactDetailsList.stream().filter(p -> p.getFirstName().equalsIgnoreCase(name))
				.collect(Collectors.toList());
		/**
		 * ForEach() method is used and it is a Terminal operations mark the stream as
		 * consumed, after which point it can no longer be used further.
		 */
		for (ContactDetails contact : collect) {
			System.out.println("Search result: " + contact);
		}
	}

	/**
	 * create method searchByCity that is Ability to search Person across the
	 * multiple AddressBook by City
	 * 
	 * @param name -passing City name
	 */
	public void searchByCity(String city) {
		List<ContactDetails> collect = contactDetailsList.stream().filter(p -> p.getCity().equalsIgnoreCase(city))
				.collect(Collectors.toList());
		for (ContactDetails contact : collect) {
			System.out.println("Search result: " + contact);
		}
	}

	/**
	 * create method searchByState that is Ability to search Person across the
	 * multiple AddressBook by State
	 * 
	 * @param name -passing State name
	 */
	public void searchByState(String state) {
		List<ContactDetails> collect = contactDetailsList.stream().filter(p -> p.getCity().equalsIgnoreCase(state))
				.collect(Collectors.toList());
		for (ContactDetails contact : collect) {
			System.out.println("Search result: " + contact);
		}
	}

	/**
	 * Declaring The Count Contacts Method By City Name Using Java Streams To Count
	 * The Contacts By using City Name
	 * 
	 * @param cityName -passing the city name to count the contacts method
	 */
	public void countContactsByUsingCity(String cityName) {
		long count = 0;
		long count1 = contactDetailsList.stream().filter(g -> g.getCity().equalsIgnoreCase(cityName)).count();
		for (ContactDetails contact : contactDetailsList) {
			count1 = count1 + count;
		}
		System.out.println("Contact List :" + count1);

	}

	/**
	 * Declaring Sort Method Sorting The Details Of Contact By Using Names Using
	 * Stream method
	 */
	public void sortByName() {
		List<ContactDetails> list = contactDetailsList.stream().collect(Collectors.toList());
		list.stream().sorted((g1, g2) -> ((String) g1.getFirstName()).compareTo(g2.getFirstName()))
				.forEach(contact -> System.out.println(contact.getFirstName() + " " + contact.getLastName()));
	}

	/**
	 * Declaring The Edit Contact Method To Edit The Details Of Contact Edit By
	 * Using FirstName If First Name Is Match The Contact Will Edit
	 */
	public void editContact() {
		System.out.println("Enter firstname of contact you want edit");
		Scanner scanner = new Scanner(System.in);
		String editName = scanner.next();
		for (int i = 0; i < contactDetailsList.size(); i++) {
			String name = contactDetailsList.get(i).getFirstName();
			if (name.equalsIgnoreCase(editName)) {
				System.out.println("Enter name is exit. you can edit the details");
				while (true) {
					System.out.println(
							"Enter\n 1. To edit all details\n 2. To edit certain detail\n 3. for previous menu");
					int choose = scanner.nextInt();
					switch (choose) {
					case 1:
						contactDetailsList.remove(i);
						writeContact();
						break;
					case 2:
						while (true) {
							System.out.println(
									"Enter\n 1. for First Name\n 2. for Last Name\n 3. for City\n 4. for State\n"
											+ " 5. for Zip Code\n 6. for Phone\n 7. forEmail\n 8. for previous menu");
							int option = scanner.nextInt();
							switch (option) {
							case 1:
								System.out.println("Enter new First Name");
								String newFirstName = scanner.next();
								contactDetailsList.get(i).setFirstName(newFirstName);
								break;
							case 2:
								System.out.println("Enter new Last Name");
								String newLastName = scanner.next();
								contactDetailsList.get(i).setLastName(newLastName);
								break;
							case 3:
								System.out.println("Enter new City");
								String newCity = scanner.next();
								contactDetailsList.get(i).setCity(newCity);
								break;
							case 4:
								System.out.println("Enter new State");
								String newState = scanner.next();
								contactDetailsList.get(i).setState(newState);
								break;
							case 5:
								System.out.println("Enter new ZipCode");
								int newZip = scanner.nextInt();
								contactDetailsList.get(i).setZipCode(newZip);
								break;
							case 6:
								System.out.println("Enter new Phone Number");
								int newPNumber = scanner.nextInt();
								contactDetailsList.get(i).setMobileNumber(newPNumber);
								break;
							case 7:
								System.out.println("Enter new Email");
								String newEmail = scanner.next();
								contactDetailsList.get(i).setEmailId(newEmail);
								break;
							case 8:
								return;
							default:
								System.out.println("Entered choice is incorrect!.. please enter correct choice");
							}
						}
					case 3:
						return;
					default:
						System.out.println("Entered choice is incorrect!.. please enter correct choice");
					}
				}
			} else {
				System.out.println("enter name not exist");
			}
		}
	}

	/**
	 * Declaring Delete Contact Method To delete The Details Of Contact Delete By
	 * Using FirstName If First Name Is Match Then Contact Will Delete
	 */
	public void deleteContact() {
		System.out.println("Enter the first name of contact you want to delete");
		Scanner scanner = new Scanner(System.in);
		String deleteName = scanner.next();
		for (int i = 0; i < contactDetailsList.size(); i++) {
			if (deleteName.equalsIgnoreCase(contactDetailsList.get(i).getFirstName())) {
				contactDetailsList.remove(i);
				System.out.println("contact delete successfully");
			} else {
				System.out.println("enter name dose not exit");
			}
		}
	}

	/**
	 * create method viewByOptions() is used to view the options by searching the
	 * person using option like name, city, state and from previous menu
	 */
	public void viewByOptions() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter\n 1. By name\n 2. By city\n 3. By state\n 4. for previous menu");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				System.out.println("Enter name: ");
				String name = scanner.nextLine();
				searchByName(name);
				break;
			case 2:
				System.out.println("Enter city: ");
				String city = scanner.nextLine();
				searchByCity(city);
				break;
			case 3:
				System.out.println("Enter state: ");
				String state = scanner.nextLine();
				searchByState(state);
				break;
			case 4:
				return;
			default:
				System.out.println("Entered choice is incorrect!.. please enter correct choice");
			}
		}
	}
}