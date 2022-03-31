public class ContactDetails {

	/**
	 * private variables can only be accessed within the same class (an outside
	 * class has no access to it) private = restricted access However, it is
	 * possible to access them if we provide public get and set methods.
	 */
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zipCode;
	private long mobileNumber;
	private String emailId;

	public ContactDetails() {

	}

	/**
	 * creating a parameterized constructor of ContactDetails by passing parameters
	 * with no return type
	 * 
	 * @param firstName    -passing first name
	 * @param lastName     -passing last name
	 * @param address      -passing address
	 * @param city         -passing city name
	 * @param state        -passing state
	 * @param zipCode      -passing zipcode
	 * @param mobileNumber -passing mobile number
	 * @param emailId      -passing emailId
	 */
	public ContactDetails(String firstName, String lastName, String address, String city, String state, int zipCode,
			long mobileNumber, String emailId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
	}

	/**
	 * getter setter methods created method getFirstName() The get method returns
	 * the value of the variable firstName.
	 * 
	 * @return -return to method created
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * The set method takes a parameter (firstName) and assigns it to the firstName
	 * variable. The this keyword is used to refer to the current object.
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * created method getlastName() The get method returns the value of the variable
	 * lastName.
	 * 
	 * @return -return to method created
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * The set method takes a parameter (lastName) and assigns it to the lastName
	 * variable. The this keyword is used to refer to the current object.
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * The get method returns the value of the variable address.
	 * 
	 * @return -return to method created
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * The set method takes a parameter (address) and assigns it to the address
	 * variable. The this keyword is used to refer to the current object.
	 * 
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * The get method returns the value of the variable city
	 * 
	 * @return -return to method created
	 */
	public String getCity() {
		return city;
	}

	/**
	 * The set method takes a parameter (city) and assigns it to the city variable.
	 * The this keyword is used to refer to the current object.
	 * 
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * The get method returns the value of the variable state.
	 * 
	 * @return -return to method created
	 */
	public String getState() {
		return state;
	}

	/**
	 * The set method takes a parameter (state) and assigns it to the state
	 * variable. The this keyword is used to refer to the current object.
	 * 
	 * @param state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * The get method returns the value of the variable zipcode.
	 * 
	 * @return -return to method created
	 */
	public int getZipCode() {
		return zipCode;
	}

	/**
	 * The set method takes a parameter (zipcode) and assigns it to the zipcode
	 * variable. The this keyword is used to refer to the current object.
	 * 
	 * @param zipcode
	 */
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * The get method returns the value of the variable MobileNumber.
	 * 
	 * @return -return to method created
	 */
	public long getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * The set method takes a parameter (mobileNumber) and assigns it to the
	 * mobileNumber variable. The this keyword is used to refer to the current
	 * object.
	 * 
	 * @param mobileNumber
	 */
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/**
	 * The get method returns the value of the variable EmailId.
	 * 
	 * @return -return to method created
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * The set method takes a parameter (emailId) and assigns it to the emailId
	 * variable. The this keyword is used to refer to the current object.
	 * 
	 * @param emailId
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "ContactDetails{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", address='"
				+ address + '\'' + ", city='" + city + '\'' + ", state='" + state + '\'' + ", zipCode=" + zipCode
				+ ", mobileNo=" + mobileNumber + ", emailId='" + emailId + '\'' + '}';

	}

}