package br.com.caelum.payable;

public class Invoice implements Payable {

	private final String partNumber;
	private final String partDescription;
	private int quantity;
	private double pricePerItem;
	
	public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
		this.quantity = validateQuantity(quantity);
		this.pricePerItem = validatePricePerItem(pricePerItem);
		this.quantity = quantity;
		this.partDescription = partDescription;
		this.partNumber = partNumber;
	}
	
	private int validateQuantity(int quantity) {
		if (quantity < 0 ) {
			throw new IllegalArgumentException("Quantity must be greater than zero.");
		}
		return quantity;
	}
	
	private double validatePricePerItem(double pricePerItem) {
		if (pricePerItem < 0.0 ) {
			throw new IllegalArgumentException("Price per item must be greater than zero.");
		}
		return pricePerItem;
	}
	
	public String getPartNumber() {
		return partNumber;
	}
	
	public String getPartDescription() {
		return partDescription;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = validateQuantity(quantity);
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public void setPricePerItem(double price) {
		this.pricePerItem = validatePricePerItem(price);
	}
	
	public double getPricePerItem() {
		return pricePerItem;
	}
	
	@Override
	public String toString() {
		return String.format("%n%s: %s (%s) %n%s: %d %n%s: $%,.2f",
				 "part number", getPartNumber(), getPartDescription(),
				"quantity", getQuantity(), "price per item", getPricePerItem());
	}
	
	@Override
	public double getPaymentAmount() {
		return getQuantity() * getPricePerItem();
	}

}
