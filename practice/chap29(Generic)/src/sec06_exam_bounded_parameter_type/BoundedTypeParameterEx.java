package sec06_exam_bounded_parameter_type;

public class BoundedTypeParameterEx {

	public static void main(String[] args) {

		// int result1 = Utill.compare("ȫ�浿", "�赿��");
		int result2 = Utill.<Integer>compare(100, 100);
		System.out.println(result2);

		// Object()�� Number ������ ���� Ŭ�����̴�. ���� Ŭ������ ����� ���� -- �ͻ����
		// int result3 = Utill.compare(new Object(),new Object());

		int result3 = Utill.compare(new Integer(100), new Double(15.78));
		System.out.println(result3);
	}

}
