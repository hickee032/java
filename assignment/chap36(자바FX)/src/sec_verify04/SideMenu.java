package sec_verify04;

import javafx.beans.property.SimpleStringProperty;

public class SideMenu {
	private SimpleStringProperty sideName;
	private SimpleStringProperty sidePrice;

	public SideMenu() {
		this.sideName = new SimpleStringProperty();
		this.sidePrice = new SimpleStringProperty();
	}

	public SideMenu(String sideName, String sidePrice) {
		this.sideName = new SimpleStringProperty(sideName);
		this.sidePrice = new SimpleStringProperty(sidePrice);
	}

	public String getsideName() {
		return sideName.get();
	}

	public String getsidePrice() {
		return sidePrice.get();
	}

	public void setPizza(String sideName) {
		this.sideName.set(sideName);
	}

	public void setPrice(String sidePrice) {
		this.sidePrice.set(sidePrice);
	}

}
