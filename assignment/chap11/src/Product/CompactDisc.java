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
		System.out.println("상품ID>> " + super.getProductID() + "\n" + "상품 설명>> " + super.getDescription() + "\n"
				+ "생산자>>" + super.getMaker() + "\n" + "가격>>" + super.getPrice() + "\n" + "앨범 제목>> "
				+ this.albumTitle + "\n" + "가수>>" + this.artist);

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
