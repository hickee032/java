package sec01_exam_CastingExample1_explain;

public class CastingExample2 {
//�ٺ� ���� ���� ���� �� �߿��ϴ�. � �ν��Ͻ��� �����ϰ� �ִ� �� Ȯ�� �Ͽ��� �Ѵ�.
	public static void main(String[] args) {

		Car car = new FireEngine(); //Car�ν��Ͻ� ����
		//���� Ÿ���� ���������� ������ �ڼ�Ÿ���� �ν��Ͻ��� �ٷ� �� �ִ�.(�������� ����� �� -> �  ����)
		//�ݴ�� �Ұ�.
		//Car car = new FireEngine(); �̷������� ����
		//car = null;
		
		Car car2 = null;

		FireEngine fe = null;
		

		car.drive();
		
		//���� Ÿ���� ���������� ������ �ڼ�Ÿ���� �ν��Ͻ��� �ٷ� �� ����.(�������� ����� � -> ��  ����)
		//�ݴ�� ���.
		//�������� ��� ������ ����� (ClassCastException) �߻�
		//���� ���� car���������� CarŬ������ �ν��Ͻ��� ������ �ִ�.
		//�̰��� �ٽ� �ڼ� Ŭ������ ���� �Ұ�.

		fe = (FireEngine) car; 		
		fe.water();
		car2 = fe;
		car2.drive();
		
	}

}
