package sec01_exam_captionTv;

public class CaptionTvExample {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();

		// System.out.println(ctv.power+" "+ ctv.caption+" "+ctv.channel);

		ctv.channel = 10;
		ctv.channelUp();

		System.out.println("���� ä��" + ctv.channel);

		ctv.display("hello world");// display�� boolean = false

		ctv.caption = true;
		ctv.display("hello world");

	}

}
