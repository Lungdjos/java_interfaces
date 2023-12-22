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
		
		this.weeklySalary = weeklySalary;
	}

	
	@Override
	public String toString() {
		return "SalariedEmployee "+ super.toString() + "weeklySalary=" + getWeeklySalary() + "]";
	}

	//implementation of the method in an interface
	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

	//end of salaried employee

}
