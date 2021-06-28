
public class Product implements Entities {
	
	private String productName;
	private double salePrice;
	
	public Product(String productName, double salePrice) {
		super();
		this.productName = productName;
		this.salePrice = salePrice;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
}
	
	