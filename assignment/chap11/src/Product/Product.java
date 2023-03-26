package Product;

public class Product {

	private int productID;

	private String description;

	private String maker;

	int price;

	public Product(int productID, String description, String maker, int price) {

		this.productID = productID;

		this.description = description; // 설명

		this.maker = maker; // 생산자

		this.price = price;

	}

	public void showInfo() {

	}

	public int getProductID() {

		return productID;

	}

	public void setProductID(int productID) {

		this.productID = productID;

	}

	public String getDescription() {

		return description;

	}

	public void setDescription(String description) {

		this.description = description;

	}

	public String getMaker() {

		return maker;

	}

	public void setMaker(String maker) {

		this.maker = maker;

	}

	public int getPrice() {

		return price;

	}

	public void setPrice(int price) {

		this.price = price;
	}
}
