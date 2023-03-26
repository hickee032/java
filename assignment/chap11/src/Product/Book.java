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

		System.out.println("상품ID>>" + super.getProductID() +"\n"+ "상품 설명>> " + super.getDescription() +"\n"+ "생산자>> "
				+ super.getMaker() + "\r\n" + "가격>> " + super.price + "\r\n" + "국제표준도서번호>> " + this.ISBN + "\r\n"
				+ "책 제목>> " + this.title + "\r\n" + "저자>> " + this.author);

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
