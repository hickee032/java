package sec04_exam_generic_method_1;

public class BoxingMethodExample {

	public static void main(String[] args) {

		// Utill Ŭ������ boxing �޼��� ���� �޼����̸鼭 ���׸� �޼����̴�.
		// �Ʒ��� ���� Ÿ���� ����(integer)���� ������Ѵ�.
		// ������ Ÿ�Կ� ���� <T>�� ���� �Ǿ�����.
		// Box<Integer> box = Utill.<Integer>boxing(new Integer(100)); <--���� �ڵ��̴�.
		// Box<Integer> box = Utill.<Integer>boxing(100);
		Box<Integer> box = Utill.boxing(100);
		int value = box.getT();
		System.out.println(value);

		Box<String> box1 = Utill.boxing("ȫ�浿");
		String str = box1.getT();
		System.out.println(str);

	}

}
