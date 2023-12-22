public class Invoice implements Payable{

	//instance variables
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;

	//constructor
	
	@Override
	public double getPaymentAmount() {
		return 0;
	}
	
}
