package edu.yaksha.stockItems;

public class GradeMismatchedException extends Exception {

	public GradeMismatchedException() {
		super();
		System.out.println("Grade should be either E or N");
	}
	

}
