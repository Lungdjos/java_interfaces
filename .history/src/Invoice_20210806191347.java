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
			throw new IllegalArgumentException("The price per item must be at least 0");
		}

		//initializing the instance variable
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}

	
	
	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}

	@Override
	public double getPaymentAmount() {
		return 0;
	}

	
}
