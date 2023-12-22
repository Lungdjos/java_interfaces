public class SalariedEmployee extends Employee {

	//instance variable
	private double weeklySalary;

	//constructors
	public SalariedEmployee(){
		super();
	}

	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
		this.weeklySalary = weeklySalary;
	}
	
	
	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(final double weeklySalary) {
		//validating the inputs from the user
		if(weeklySalary < 0.0){
			throw new IllegalArgumentException("The weekly salary must be at least 0");
		}
		this.weeklySalary = weeklySalary;
	}

	
	@Override
	public String toString() {
		return "Salaried Employee Details "+ super.toString() + "Weekly Salary=" + getWeeklySalary() + "]";
	}

	//implementation of the method in an interface
	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return getWeeklySalary();
	}

	//end of salaried employee

}
