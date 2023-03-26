
public class Song {

	private String title;
	private String artist;
	private String album;
	private String[] composer;
	private int year;
	private int track;

	public Song() {
		
		this("엄마 부탁해요", "홍진영", "엄마부탁해요OST", "윤일상,한효주,김을동", 2016, 5);
		
	}

	public Song(String title, String artist, String album, String[] composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
	}

	public show() {
		
		
	}
}
