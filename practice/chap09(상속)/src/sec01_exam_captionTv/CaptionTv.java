package sec01_exam_captionTv;

//�ڼ�Ŭ����(�ڽ�Ŭ����,sub)������� 7��
//Tv ,CaptionTv ���� ������ ���� ����
public class CaptionTv extends Tv {

	boolean caption; // ĸ�ǻ��� �� ����

	public CaptionTv() {
		super();// ����Ŭ������ �⺻ �������� ȣ�� //�Ű������� �ִ� �����ڰ� �ִٸ� �ݵ�� super(); �� �ݵ�� �־�� �Ѵ�.
		System.out.println("�ڼ� Ŭ������ ������ ȣ��");
	}

	public void display(String text) {

		// 1��° ȣ��ÿ��� false 2��°�� true
		// caption on(true)�϶��� text�� �����ش�.
		if (this.caption) {
			System.out.println(text);
		}
	}
}
