package Product;

public class Book extends Product {

	private int ISBN;

	private String title;

	private String author;

	public Book(int productID, String description, String maker, int price, int ISBN, String title, String author) {

		super(productID, description, maker, price);

		this.ISBN = ISBN;

		this.title = title;

		this.author = author;

	}

	@Override

	public void showInfo() {

		System.out.println("��ǰID>>" + super.getProductID() +"\n"+ "��ǰ ����>> " + super.getDescription() +"\n"+ "������>> "
				+ super.getMaker() + "\r\n" + "����>> " + super.price + "\r\n" + "����ǥ�ص�����ȣ>> " + this.ISBN + "\r\n"
				+ "å ����>> " + this.title + "\r\n" + "����>> " + this.author);

	}

	public int getISBN() {

		return ISBN;

	}

	public void setISBN(int iSBN) {

		ISBN = iSBN;

	}

	public String getTitle() {

		return title;

	}

	public void setTitle(String title) {

		this.title = title;

	}

	public String getAuthor() {

		return author;

	}

	public void setAuthor(String author) {

		this.author = author;

	}

}
