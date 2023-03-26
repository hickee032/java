package Product;

public class ConversationBook extends Book {

	private String language;

	public ConversationBook(int productID, String description, String maker, int price, int ISBN, String title,

			String author, String language) {

		super(productID, description, maker, price, ISBN, title, author);

	}

	@Override

	public void showInfo() {

		System.out.println(
				"상품ID>>" + super.getProductID() + "상품 설명>> " + super.getDescription() + "생산자>> " + super.getMaker()
						+ "\n" + "가격>> " + super.price + "\n" + "국제표준도서번호>> " + super.getISBN() + "\n" + "책 제목>> "
						+ super.getTitle() + "\n" + "저자>> " + super.getAuthor() + "\n" + "저자>> " + this.language);

	}

	public String getLanguage() {

		return language;

	}

	public void setLanguage(String language) {

		this.language = language;

	}

}
