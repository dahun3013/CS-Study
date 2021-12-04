package algorismProject2;

public class Product implements Comparable<Product>{
	private int productNumber;
	private String productName;

	Product(int productNumber, String productName){
		this.productNumber = productNumber;
		this.productName = productName;
	}

	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductNumber() {
		return productNumber;
	}

	public String getProductName() {
		return productName;
	}

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return this.productNumber - o.productNumber;
	}

	@Override
	public String toString() {
		return "[상품번호:" + productNumber + ", 상품명:" + productName + "]";
	}
	
	
}
