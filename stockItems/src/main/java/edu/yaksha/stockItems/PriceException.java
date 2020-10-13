package edu.yaksha.stockItems;

public class PriceException extends Exception {

	public PriceException() {
		super();
		System.out.println("Sales Price cannot lesser than purchase price");
	}
	

}
