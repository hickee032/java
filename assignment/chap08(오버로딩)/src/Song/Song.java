package Song;

public class Song {

	private String title;

	private String artist;

	private String album;

	private String[] composer;

	private int year;

	private int track;

	public Song() {

		this("엄마 부탁해요~", "홍진영", "엄마 부탁해요 OST", new String[] { "윤일상", "한효주", "김을동" }, 2016, 5);

	}

	// 매개변수가 있는 생성자(멤버변수 초기화)
	public Song(String title, String artist, String album, String composer[], int year, int track) {

		this.title = title;

		this.artist = artist;

		this.album = album;

		this.composer = composer;

		this.year = year;

		this.track = track;

	}

	public void show() {

		System.out.println("노래 : " + this.getTitle());

		System.out.println("가수 : " + this.getArtist());

		System.out.println("앨범 : " + album);

		System.out.print("작곡가 : ");

		// System.out.print(Arrays.toString(this.composer));
		for (int i = 0; i < composer.length; i++) {
			if (i == (composer.length - 1)) {
				System.out.print(composer[i]);
			} else {
				System.out.print(composer[i] + ",");
			}
		}

		System.out.println();

		System.out.println("년도 : " + year);

		System.out.println("트랙 번호 : " + track);

	}

	public String getTitle() {

		return title;

	}

	public String getArtist() {

		return artist;

	}

	public String getAlbum() {

		return album;

	}

	public String[] getComposer() {

		return composer;

	}

	public int getYear() {

		return year;

	}

	public int getTrack() {

		return track;

	}

}
