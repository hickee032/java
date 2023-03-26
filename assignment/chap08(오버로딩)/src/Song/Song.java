package Song;

public class Song {

	private String title;

	private String artist;

	private String album;

	private String[] composer;

	private int year;

	private int track;

	public Song() {

		this("���� ��Ź�ؿ�~", "ȫ����", "���� ��Ź�ؿ� OST", new String[] { "���ϻ�", "��ȿ��", "������" }, 2016, 5);

	}

	// �Ű������� �ִ� ������(������� �ʱ�ȭ)
	public Song(String title, String artist, String album, String composer[], int year, int track) {

		this.title = title;

		this.artist = artist;

		this.album = album;

		this.composer = composer;

		this.year = year;

		this.track = track;

	}

	public void show() {

		System.out.println("�뷡 : " + this.getTitle());

		System.out.println("���� : " + this.getArtist());

		System.out.println("�ٹ� : " + album);

		System.out.print("�۰ : ");

		// System.out.print(Arrays.toString(this.composer));
		for (int i = 0; i < composer.length; i++) {
			if (i == (composer.length - 1)) {
				System.out.print(composer[i]);
			} else {
				System.out.print(composer[i] + ",");
			}
		}

		System.out.println();

		System.out.println("�⵵ : " + year);

		System.out.println("Ʈ�� ��ȣ : " + track);

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
