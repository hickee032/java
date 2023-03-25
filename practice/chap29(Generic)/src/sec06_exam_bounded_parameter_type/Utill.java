package sec06_exam_bounded_parameter_type;

public class Utill {

	// �Ű������� TŸ���� Number(�߻� Ŭ����)�� �ڼ� Ŭ������ �ü��ֵ��� ����.
	public static <T extends Number> int compare(T t1, T t2) {
		// Number class �� doubleValue()�� �߻�޼��� ������ Number�� �ڼ� Ŭ���� (Docs �� ����)
		// �� ������ �Ͽ��� ������ �Ʒ� Ŭ������ ���� ���� �ʴ´�.

		double value1 = t1.doubleValue();
		double value2 = t2.doubleValue();

		return Double.compare(value1, value2);
	}
}
