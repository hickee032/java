package sec01_List.exam02_Vector;

public class Boraed {
	String subject;
	String content;
	String writer;

	public Boraed(String subject, String content, String writer) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}

	@Override
	public String toString() {
		return this.subject + ", " + this.content + ", " + this.writer;
	}
}
