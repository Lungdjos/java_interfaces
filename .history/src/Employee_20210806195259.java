public abstract class Employee implements Payable {

	//instance variables
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;

	//constructors
	public Employee() {
	}
	public Employee(final String firstName, final String lastName, final String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	//get and set methods
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(final String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	//printing the employee details
	@Override
	public String toString() {
		return "First Name: " + getFirstName() + ", Last Name: " + getLastName() + ", social Security Number: "
				+ getSocialSecurityNumber() + " ";
	}

	
}
