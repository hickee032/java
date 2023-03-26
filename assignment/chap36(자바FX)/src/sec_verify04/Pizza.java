package sec_verify04;

import javafx.beans.property.SimpleStringProperty;

public class Pizza {

	private SimpleStringProperty pizza;
	private SimpleStringProperty price;
	private SimpleStringProperty image;

	public Pizza() {
		this.pizza = new SimpleStringProperty();
		this.price = new SimpleStringProperty();
		this.image = new SimpleStringProperty();
	}

	public Pizza(String pizza, String price, String image) {
		this.pizza = new SimpleStringProperty(pizza);
		this.price = new SimpleStringProperty(price);
		this.image = new SimpleStringProperty(image);
	}

	// getter
	public String getPizza() {
		return pizza.get();
	}

	public String getPrice() {
		return price.get();
	}

	public String getImage() {
		return image.get();
	}

	// setter
	public void setPizza(String pizza) {
		this.pizza.set(pizza);
	}

	public void setPrice(String price) {
		this.price.set(price);
	}

	public void setImage(String image) {
		this.image.set(image);
	}

}
