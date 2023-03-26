package Goods;

public class Goods {

	private String name;

	private int price;

	private int numberOfStock;

	private int sold;

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public int getPrice() {

		return price;

	}

	public void setPrice(int price) {

		this.price = price;

	}

	public int getNumberOfStock() {

		return numberOfStock;

	}

	public void setNumberOfStock(int numberOfStock) {

		this.numberOfStock = numberOfStock;

	}

	public int getSold() {

		return sold;

	}

	public void setSold(int sold) {

		this.sold = sold;

	}

	// �Ű������� �ִ� ������
	public Goods(String name, int price, int numberOfStock, int sold) {

		this.name = name;

		this.price = price;

		this.numberOfStock = numberOfStock;

		this.sold = sold;

	}

	@Override

	public String toString() {

		String str = this.getName() + "\t" + this.getPrice() + "\t" + this.getNumberOfStock() + "\t" + this.getSold();

		// System.out.println("�Է��Ͻ� ��ǰ�� �̸�, ����, ���, �ȸ����� �� ��Ȳ�Դϴ�.");

		return str;

	}

}
