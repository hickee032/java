package sec01_exam_CastingExample1_explain;

public class CastingExample1 {

	public static void main(String[] args) {
		
		Car car = null;
		
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water(); //FireEngine Ŭ���� �� �ִ� ���
		fe.drive(); //Car Ŭ���� �� �ִ� ���
		
		
		//�ʵ��� ������.
		//Car car = new FireEngine();
		car = fe;//car = (car)fe; upcasting ����ȯ�� ���� ���� �ϴ�.
		
		car.drive();
		//car.water(); //������ ���� �߻� 
						/* car�� �ٺ��� Car�̱⶧���� FireEngine�� �ִ� water()�� ����Ҽ� ����. 
						 * �׷��� ���ܰ� �߻�
						 */
		
		fe2 = (FireEngine)car; //downcasting �̶� ���� ����ȯ �ڵ带 �ݵ�� �־�� �Ѵ�.
		fe2.water(); //fe2������ water()�� ȣ�� �ȴ�. �� ������ 
					//fe2�� �ٺ��� FireEngineŬ���� �̴�. �׷��� water()�� ��� �Ҽ� ������
					//������ �߻����� �ʴ� ��.
	}

}
