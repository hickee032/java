package sec04_exam_generic_method_1;

public class Utill {

	// <T>�� ���׸� Ÿ���� �޼��带 ��Ī�ϸ� ���� Ÿ�԰� �Ű����� Ÿ���� �����ϰ� T�� ���������Ѵ�.
	// �ܺη� TŸ���� �Ű������� �޾Ƽ� Box<T>��ü�� �����ؼ� �ּҸ� ���� ���ִ� �޼���
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.setT(t);
		return box;

	}
}
