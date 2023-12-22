public class Invoice implements Payable{

	//instance variables
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;

	//constructor
	public Invoice() {
	}
	
	public Invoice(final String partNumber, String partDescription, int quantity, double pricePerItem) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}
	
	@Override
	public double getPaymentAmount() {
		return 0;
	}

	
}
