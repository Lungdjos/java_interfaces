public class SalariedEmployee extends Employee {

	//instance variable
	private double weeklySalary;

	//constructors
	

	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
		this.weeklySalary = weeklySalary;
	}
	
	//implementation of the method in an interface
	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

	//end 

}
