package edu.yaksha.stockItems;

public class EssentialCommodityException extends Exception {

	public EssentialCommodityException() {
		super();
		System.out.println("Sales Price cannot more than 25% of purchase price");
	}
	

}
