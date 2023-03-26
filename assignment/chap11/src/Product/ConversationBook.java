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
				"��ǰID>>" + super.getProductID() + "��ǰ ����>> " + super.getDescription() + "������>> " + super.getMaker()
						+ "\n" + "����>> " + super.price + "\n" + "����ǥ�ص�����ȣ>> " + super.getISBN() + "\n" + "å ����>> "
						+ super.getTitle() + "\n" + "����>> " + super.getAuthor() + "\n" + "����>> " + this.language);

	}

	public String getLanguage() {

		return language;

	}

	public void setLanguage(String language) {

		this.language = language;

	}

}
