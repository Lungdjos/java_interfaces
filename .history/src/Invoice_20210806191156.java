public class Invoice implements Payable{

	//instance variables
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;

	//constructor
	public Invoice() {
	}
	
	public Invoice(final String partNumber, final String partDescription, final int quantity, final double pricePerItem) {
		//validating the input
		if(quantity < 0){
			throw new IllegalArgumentException("The quantity must be at least 0.");
		}
		if (pricePerItem < 0.0){
			throw new IllegalArgumentException()
		}
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
