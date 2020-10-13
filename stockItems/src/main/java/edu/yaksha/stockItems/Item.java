package edu.yaksha.stockItems;
  
public class Item {
	private Integer id;
	private String name;
	private Double purchasePrice;
	private Double salesPrice;
	private String grade;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(Integer id, String name, Double purchasePrice, Double salesPrice, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.purchasePrice = purchasePrice;
		this.salesPrice = salesPrice;
		this.grade = grade;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(Double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public Double getSalesPrice() {
		return salesPrice;
	}
	public void setSalesPrice(Double salesPrice) {
		this.salesPrice = salesPrice;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return String.format("%-5s %-20s %-10s %-10s %-5s",id,name,purchasePrice,salesPrice,grade);
	}
	@Override
	public int hashCode() {
		
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		
		Item other = (Item) obj;
		int x=this.id;
		int y=other.id;
		if (x==y)
			return true; ;
		return false;
		
	}
	

}
