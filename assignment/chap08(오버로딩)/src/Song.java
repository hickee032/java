
public class Song {

	private String title;
	private String artist;
	private String album;
	private String[] composer;
	private int year;
	private int track;

	public Song() {
		
		this("���� ��Ź�ؿ�", "ȫ����", "������Ź�ؿ�OST", "���ϻ�,��ȿ��,������", 2016, 5);
		
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
