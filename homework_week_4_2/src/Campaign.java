
public class Campaign {
	
	private String name;
	private double discountRate;
	
	public Campaign() {
		
	}
	public Campaign(String name, double discountRate) {
		super();
		this.name = name;
		this.discountRate = discountRate;
	}
	public String getName(){return name;}
	public void setName(String name){this.name = name;}
	
	public double getDiscountRate(){return discountRate;}
	public void setDiscountRate(double discountRate){this.discountRate = discountRate;}

}
