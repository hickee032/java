package Product;

public class CompactDisc extends Product {

	private String albumTitle;

	private String artist;

	public CompactDisc(int productID, String description, String maker, int price, String albumTitle, String artist) {

		super(productID, description, maker, price);

		this.albumTitle = albumTitle;

		this.artist = artist;

	}

	@Override

	public void showInfo() {
		System.out.println("��ǰID>> " + super.getProductID() + "\n" + "��ǰ ����>> " + super.getDescription() + "\n"
				+ "������>>" + super.getMaker() + "\n" + "����>>" + super.getPrice() + "\n" + "�ٹ� ����>> "
				+ this.albumTitle + "\n" + "����>>" + this.artist);

	}

	public String getAlbumTitle() {

		return albumTitle;

	}

	public void setAlbumTitle(String albumTitle) {

		this.albumTitle = albumTitle;

	}

	public String getArtist() {

		return artist;

	}

	public void setArtist(String artist) {

		this.artist = artist;

	}

}
