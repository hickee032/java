package sec02_exam_method;

public class StrinfTrimExample {

	public static void main(String[] args) {
		// trim() ���ڿ��� �������� �¿� (�յ�) ������ �����Ѵ�.
		// �Ͽ� ���ڿ� �߰��� �ִ� ������ ���α׷��Ӱ� ã�Ƽ� �������ִ� �ڵ带 ������Ѵ�.
		//���̵� �н����� �Է¹��� ��� trim()Ȱ���ϸ� ������ ���� ���ϼ� �ִ�.
		String tel1 = "           053";
		String tel2 = "-611          ";
		String tel3 = "-10     38    ";

		System.out.println(tel1.trim() + tel2.trim() + tel3.trim());

	}

}
